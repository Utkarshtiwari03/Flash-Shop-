package com.example.Flash_shop.service.user;

import com.example.Flash_shop.dto.UserDto;
import com.example.Flash_shop.model.User;
import com.example.Flash_shop.request.CreateUserRequest;
import com.example.Flash_shop.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();    
}
