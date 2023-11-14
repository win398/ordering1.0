package cn.esileme.controller;

import cn.esileme.model.Food;
import cn.esileme.model.QueryVo;
import cn.esileme.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("food")
@Controller
public class FoodController {
    @Autowired
    private IFoodService foodService;

    @RequestMapping("getListBySid")
    @ResponseBody
    public List<Food> getListBySid(@RequestBody QueryVo vo) {
        return foodService.getListBySid(vo.getSid());
    }

    @RequestMapping("getFoodsOrderBySales")
    @ResponseBody
    public List<Food> getFoodsOrderBySales(@RequestBody QueryVo vo) {
        return foodService.getFoodsOrderBySales(vo.getSid());
    }

    @RequestMapping("getDetailByfid")
    @ResponseBody
    public Food getDetailByfid(@RequestBody QueryVo vo) {
        return foodService.getDetailByfid(vo.getFid());
    }




}
