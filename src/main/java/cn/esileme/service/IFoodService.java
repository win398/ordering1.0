package cn.esileme.service;

import cn.esileme.model.Food;

import java.util.List;

public interface IFoodService {
    List<Food> getListBySid(int sid);
    List<Food> getFoodsOrderBySales(int sid);
    Food getDetailByfid(int fid);
}
