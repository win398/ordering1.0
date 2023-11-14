package cn.esileme.controller;

import cn.esileme.model.Fcom;
import cn.esileme.model.QueryVo;
import cn.esileme.service.IFComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("fcom")
@Controller
public class FComController {
    @Autowired
    private IFComService fComService;

    @ResponseBody
    @RequestMapping("submitEva")
    public String submitEva(@RequestBody QueryVo vo){
        return fComService.savaCom(vo.getEvaList(), vo.getOid());
    }

    @ResponseBody
    @RequestMapping("getEvaList")
    public List<Fcom> getEvaList(@RequestBody QueryVo vo){
        return fComService.getEvaList(vo.getSid());
    }

    @ResponseBody
    @RequestMapping("getEvaListByfid")
    public List<Fcom> getEvaListByfid(@RequestBody QueryVo vo){
        return fComService.getEvaListByfid(vo.getFid());
    }



}
