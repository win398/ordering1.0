package cn.esileme.service.impl;

import cn.esileme.mapper.ForderMapper;
import cn.esileme.model.Forder;
import cn.esileme.model.ForderExample;
import cn.esileme.model.OrderFood;
import cn.esileme.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private ForderMapper orderMapper;

    @Autowired
    private OrderFoodService orderFoodService;

    @Override
    public int insertOrder(Forder o) {
        o.setOtime(new Date());
        orderMapper.insert(o);

        //get oid
        ForderExample orderExample = new ForderExample();
        orderExample.createCriteria().andOnoEqualTo(o.getOno());
        List<Forder> orders = orderMapper.selectByExample(orderExample);
        if (orders.size() > 0 && orders != null) {
            o.setOid(orders.get(0).getOid());
        }
        else {
            System.out.println("保存订单失败！");
            return 0;
        }

        List<OrderFood> foodlist = o.getFoodList();
        for(int i = 0; i < foodlist.size(); i++) {
            OrderFood orderFood = foodlist.get(i);
            orderFood.setOid(o.getOid());
            orderFoodService.order_food_insert(orderFood);
        }
        return o.getOid();
    }

    @Override
    public Forder getOrder(int oid) {
        return orderMapper.getOrder(oid);
    }

    @Override
    public List<Forder> getOrderByStoreMan(int uid) {
        return orderMapper.getOrderByStoreMan(uid);
    }

    @Override
    public String orderDelivery(int oid) {
        Forder forder = orderMapper.selectByPrimaryKey(oid);
        if(forder.getOstatus() == 1) {
            forder.setOstatus(2);
            ForderExample forderExample = new ForderExample();
            forderExample.createCriteria().andOidEqualTo(oid);
            orderMapper.updateByExample(forder, forderExample);
            return "ok1";
        }
        else if (forder.getOstatus() == 2) {
            forder.setOstatus(3);
            ForderExample forderExample = new ForderExample();
            forderExample.createCriteria().andOidEqualTo(oid);
            orderMapper.updateByExample(forder, forderExample);
            return "ok2";
        }
        else if (forder.getOstatus() == 3) {
            forder.setOstatus(4);
            ForderExample forderExample = new ForderExample();
            forderExample.createCriteria().andOidEqualTo(oid);
            orderMapper.updateByExample(forder, forderExample);
            return "ok3";
        }
        return "error";
    }

    @Override
    public List<Forder> getOrderByUid(int uid) {
        return orderMapper.getOrderByUid(uid);
    }

    @Override
    public List<Forder> evaluateOrder(int uid) {
        return orderMapper.evaluateOrder(uid);
    }
}
