package com.csi.dao;

import com.csi.model.User;

public interface UserDao {

    public void signUp(User user);

    public boolean signIn(String userEmailId, String userPassword);
}
