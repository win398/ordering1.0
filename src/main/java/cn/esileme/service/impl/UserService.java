package cn.esileme.service.impl;

import cn.esileme.mapper.UserMapper;
import cn.esileme.model.User;
import cn.esileme.model.UserExample;
import cn.esileme.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User u) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUnameEqualTo(u.getUname()).andPaswdEqualTo(u.getPaswd());
        List<User> list = userMapper.selectByExample(userExample);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public void rigist(User u) {
        u.setRgtime(new Date());
        u.setType(1);
        userMapper.insert(u);
    }

    @Override
    public String checkUsername(User u) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUnameEqualTo(u.getUname());
        List<User> users = userMapper.selectByExample(userExample);
        if(users != null && users.size() > 0){
            return "exist";
        }
        else{
            return "notExist";
        }
    }
}
