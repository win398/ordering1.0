package cn.esileme.service;

import cn.esileme.model.User;

public interface IUserService {
    User login(User u);
    void rigist(User u);
    String checkUsername(User u);
}
