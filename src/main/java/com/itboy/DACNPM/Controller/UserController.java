package com.itboy.DACNPM.Controller;

import com.itboy.DACNPM.Model.User;
import com.itboy.DACNPM.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    //http://localhost:8080/api/user
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public Optional<User> getProducById(@RequestParam("email") String email, @RequestParam("password") String password){
        return userService.checkLogin(email,password);
    }
    @PostMapping("/register")
    public String register(@RequestBody User user){
        userService.register(user);
        return "Đăng ký thành công";
    }
}
