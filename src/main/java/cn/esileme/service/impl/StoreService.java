package cn.esileme.service.impl;

import cn.esileme.mapper.StoreMapper;
import cn.esileme.model.Store;
import cn.esileme.model.StoreExample;
import cn.esileme.service.IStoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService implements IStoreService {
    @Autowired
    private StoreMapper storeMapper;

    @Override
    public PageInfo<Store> selectAllStores(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        StoreExample storeExample = new StoreExample();
        storeExample.setOrderByClause("sid asc");
        List<Store> list =storeMapper.selectByExample(storeExample);
        PageInfo<Store> storePageInfo = new PageInfo<>(list);
        return storePageInfo;
    }

    @Override
    public PageInfo<Store> getListByKindId(int pageNum, int pageSize, int kindid) {
        PageHelper.startPage(pageNum, pageSize);
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        criteria.andKidEqualTo(kindid);
        List<Store> list = storeMapper.selectByExample(storeExample);
        PageInfo<Store> storePageInfo = new PageInfo<>(list);
        return storePageInfo;
    }

    @Override
    public Store getStoreInfo(int sid) {
        return storeMapper.selectByPrimaryKey(sid);
    }

    @Override
    public PageInfo<Store> storeSearch(int pageNum, int pageSize, int kid, String keyword) {
        PageHelper.startPage(pageNum, pageSize);
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        criteria.andSnameLike("%"+keyword+"%");
        if (kid != 0) {
            criteria.andKidEqualTo(kid);
        }
        List<Store> list = storeMapper.selectByExample(storeExample);
        PageInfo<Store> storePageInfo = new PageInfo<>(list);
        return storePageInfo;
    }
}
