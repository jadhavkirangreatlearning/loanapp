package com.csi.service;

import com.csi.dao.UserDao;
import com.csi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDaoImpl;


    @Override
    public void signUp(User user) {
        userDaoImpl.signUp(user);
    }

    @Override
    public boolean signIn(String userEmailId, String userPassword) {
        return userDaoImpl.signIn(userEmailId, userPassword);
    }
}
