package cn.esileme.controller;

import cn.esileme.model.Skind;
import cn.esileme.service.ISkindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("skind")
@Controller
public class SkindController {
    @Autowired
    private ISkindService skindService;

    @ResponseBody
    @RequestMapping("getSkindList")
    public List<Skind> getSkindList() {
        return skindService.getSKindList();
    }

}
