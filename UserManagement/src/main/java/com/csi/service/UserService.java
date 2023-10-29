package com.csi.service;

import com.csi.model.User;

public interface UserService {

    public void signUp(User user);

    public boolean signIn(String userEmailId, String userPassword);
}
