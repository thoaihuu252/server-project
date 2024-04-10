package com.itboy.DACNPM.Service.Imp;
import com.itboy.DACNPM.Model.User;
import com.itboy.DACNPM.Repository.AddressRepository;
import com.itboy.DACNPM.Repository.UserRepository;
import com.itboy.DACNPM.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public Optional<User> checkLogin(String email, String password) {
        Optional<User> userOptional  = Optional.ofNullable(userRepository.findByEmail(email));
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            String hashedPassword = user.getPassword();
            if (BCrypt.checkpw(password, hashedPassword)){
                return userOptional;
            }
        }
        return null;
    }

    @Override
    public boolean register(User user) {
        if (userRepository.existsByEmailUser(user.getEmailUser())) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        addressRepository.save(user.getAddress());
        userRepository.save(user);
        return true;
    }
}
