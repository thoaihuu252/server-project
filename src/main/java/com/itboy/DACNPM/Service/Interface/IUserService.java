package com.itboy.DACNPM.Service.Interface;
import com.itboy.DACNPM.models.*;
import com.itboy.DACNPM.dtos.*;
import com.itboy.DACNPM.responses.UserResponse;

import java.util.List;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password) throws Exception;
    User getUserDetailsFromToken(String token) throws Exception;
    List<UserResponse> getAllUsers() ;
}
