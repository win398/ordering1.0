package cn.esileme.service;

import cn.esileme.model.Store;
import com.github.pagehelper.PageInfo;

public interface IStoreService {
    PageInfo<Store> selectAllStores(int pageNum, int pageSize);
    PageInfo<Store> getListByKindId(int pageNum, int pageSize, int kindid);
    Store getStoreInfo(int sid);
    PageInfo<Store> storeSearch(int pageNum, int pageSize, int kid, String keyword);
}
