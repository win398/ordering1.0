package cn.esileme.service.impl;

import cn.esileme.mapper.FcomMapper;
import cn.esileme.mapper.ForderMapper;
import cn.esileme.model.Fcom;
import cn.esileme.model.FcomExample;
import cn.esileme.model.Forder;
import cn.esileme.service.IFComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FComService implements IFComService {
    @Autowired
    private FcomMapper fcomMapper;
    @Autowired
    private ForderMapper forderMapper;

    @Override
    public String savaCom(List<Fcom> evaList, int oid) {
        for (int i = 0; i < evaList.size(); i++) {
            Fcom fcom = evaList.get(i);
            fcom.setTime(new Date());
            fcomMapper.insert(fcom);
        }
        Forder forder = new Forder();
        forder.setOstatus(5);
        forder.setOid(oid);
        System.out.println(forder);
        System.out.println(forder.getOstatus());
        forderMapper.updateByPrimaryKeySelective(forder);
        return "ok";
    }

    @Override
    public List<Fcom> getEvaList(int sid) {
        return fcomMapper.getEvaList(sid);
    }

    @Override
    public List<Fcom> getEvaListByfid(int fid) {
        return fcomMapper.getEvaListByfid(fid);
    }
}
