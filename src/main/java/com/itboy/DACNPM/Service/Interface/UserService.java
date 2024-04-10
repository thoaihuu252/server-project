package com.itboy.DACNPM.Service.Interface;

import com.itboy.DACNPM.Model.User;

import java.util.Optional;

public interface UserService {

    public Optional<User> checkLogin(String email, String password);
    public boolean register(User user);

}
