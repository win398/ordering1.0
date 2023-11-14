package cn.esileme.service.impl;

import cn.esileme.mapper.OrderFoodMapper;
import cn.esileme.model.OrderFood;
import cn.esileme.service.IOrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFoodService implements IOrderFoodService {
    @Autowired
    private OrderFoodMapper orderFoodMapper;

    @Override
    public void order_food_insert(OrderFood of) {
        orderFoodMapper.insert(of);
    }
}
