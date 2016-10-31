package com.udea.login.service;

import com.udea.login.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
