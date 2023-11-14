package cn.esileme.controller;

import cn.esileme.model.QueryVo;
import cn.esileme.model.Store;
import cn.esileme.service.IStoreService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/store")
@Controller
public class StoreController {
    @Autowired
    private IStoreService storeService;

    @ResponseBody
    @RequestMapping("getAll")
    public PageInfo<Store> getAll(@RequestBody QueryVo vo) {
        return storeService.selectAllStores(vo.getPageNum(), 10);
    }

    @ResponseBody
    @RequestMapping("getByKind")
    public PageInfo<Store> getByKind(@RequestBody QueryVo vo) {
        return storeService.getListByKindId(vo.getPageNum(), 10, vo.getKid());
    }

    @ResponseBody
    @RequestMapping("getStoreInfo")
    public Store getStoreInfo(@RequestBody QueryVo vo) {
        return storeService.getStoreInfo(vo.getSid());
    }

    @ResponseBody
    @RequestMapping("storeSearch")
    public PageInfo<Store> storeSearch(@RequestBody QueryVo vo) {
        return storeService.storeSearch(vo.getPageNum(), 10, vo.getKid(), vo.getKeyword());
    }




}
