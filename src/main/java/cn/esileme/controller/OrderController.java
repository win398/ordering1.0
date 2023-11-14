package cn.esileme.controller;

import cn.esileme.model.Forder;
import cn.esileme.model.QueryVo;
import cn.esileme.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("order")
@Controller
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("orderStart")
    @ResponseBody
    public int orderStart(@RequestBody Forder o) {
        return orderService.insertOrder(o);
    }

    @RequestMapping("getOrder")
    @ResponseBody
    public Forder getOrder(@RequestBody QueryVo vo) {
        return orderService.getOrder(vo.getOid());
    }

    @RequestMapping("getOrderByStoreMan")
    @ResponseBody
    public List<Forder> getOrderByStoreMan(@RequestBody QueryVo vo) {
        return orderService.getOrderByStoreMan(vo.getUid());
    }

    @RequestMapping("orderDelivery")
    @ResponseBody
    public String orderDelivery(@RequestBody QueryVo vo) {
        return orderService.orderDelivery(vo.getOid());
    }

    @RequestMapping("getOrderByUid")
    @ResponseBody
    public List<Forder> getOrderByUid(@RequestBody QueryVo vo) {
        return orderService.getOrderByUid(vo.getUid());
    }
    @RequestMapping("evaluateOrder")
    @ResponseBody
    public List<Forder> evaluateOrder(@RequestBody QueryVo vo) {
        return orderService.evaluateOrder(vo.getUid());
    }


}
