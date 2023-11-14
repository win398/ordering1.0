package cn.esileme.controller;

import cn.esileme.model.User;
import cn.esileme.service.IUserService;
import cn.esileme.service.impl.UserService;
import cn.hutool.core.io.file.FileNameUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.setting.dialect.Props;
import cn.hutool.setting.dialect.PropsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("login")
    public User login (@RequestBody User u) {
        return userService.login(u);
    }

    @ResponseBody
    @RequestMapping("regist")
    public String regist (User u) {
        MultipartFile file = u.getImgFile();
        if(file.isEmpty()){
            return "error";
        }
        //重命名
        String fileName = file.getOriginalFilename();
        String newFileName = UUID.fastUUID().toString(true)+"."+ FileNameUtil.extName(fileName);
        Props props = PropsUtil.get("db.properties");
        String uploadPath = props.getStr("uploadPath");
        //创建文件实例
        File filePath = new File(uploadPath, newFileName);
        //若文件目录不存在则创建目录
        if(!filePath.getParentFile().exists()){
            filePath.getParentFile().mkdir();
            System.out.println("创建目录"+filePath);
        }

        //写入
        try {
            file.transferTo(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        u.setImage(newFileName);
        userService.rigist(u);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("checkUsername")
    public String checkUsername(@RequestBody User u){
        return userService.checkUsername(u);
    }


}
