package cn.esileme.service.impl;

import cn.esileme.mapper.FoodMapper;
import cn.esileme.model.Food;
import cn.esileme.model.FoodExample;
import cn.esileme.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService implements IFoodService {
    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getListBySid(int sid) {
        FoodExample foodExample = new FoodExample();
        FoodExample.Criteria criteria = foodExample.createCriteria();
        criteria.andSidEqualTo(sid);
        List<Food> list = foodMapper.selectByExample(foodExample);
        return list;
    }

    @Override
    public List<Food> getFoodsOrderBySales(int sid) {
        FoodExample foodExample = new FoodExample();
        FoodExample.Criteria criteria = foodExample.createCriteria();
        criteria.andSidEqualTo(sid);
        foodExample.setOrderByClause("fsales desc");
        List<Food> list = foodMapper.selectByExample(foodExample);
        return list;
    }

    @Override
    public Food getDetailByfid(int fid) {
        return foodMapper.selectByPrimaryKey(fid);
    }
}
