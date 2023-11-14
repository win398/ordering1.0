package cn.esileme.service;

import cn.esileme.model.Forder;

import java.util.List;

public interface IOrderService {
    int insertOrder(Forder o);
    Forder getOrder(int oid);
    List<Forder> getOrderByStoreMan(int uid);
    String orderDelivery(int oid);
    List<Forder> getOrderByUid(int uid);
    List<Forder> evaluateOrder(int uid);
}
