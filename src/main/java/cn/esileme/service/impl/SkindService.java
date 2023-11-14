package cn.esileme.service.impl;

import cn.esileme.mapper.SkindMapper;
import cn.esileme.model.Skind;
import cn.esileme.service.ISkindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkindService implements ISkindService {
    @Autowired
    private SkindMapper skindMapper;

    @Override
    public List<Skind> getSKindList() {
        return skindMapper.selectByExample(null);
    }
}
