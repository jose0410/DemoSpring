package com.udea.login.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
