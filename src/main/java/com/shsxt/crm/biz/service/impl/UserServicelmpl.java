package com.shsxt.crm.biz.service.impl;

import com.shsxt.crm.biz.dao.UserDao;
import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.biz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserServicelmpl  implements IUserService{

    @Autowired
    private UserDao userDao;

    public User get(int id){
        return userDao.get(id);
    }



}
