package cn.esileme.service;

import cn.esileme.model.Fcom;

import java.util.List;

public interface IFComService {
    String savaCom(List<Fcom> evaList, int oid);
    List<Fcom> getEvaList(int sid);
    List<Fcom> getEvaListByfid(int fid);
}
