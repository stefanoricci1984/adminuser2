package com.neotech.adminuser.service;

import com.neotech.adminuser.dto.UserDto;
import com.neotech.adminuser.model.User;

import java.util.List;

public interface UserService {
    User save (UserDto userDto);


    List<User> findAll();

    User findByEmail(String email);

    void delete(User user);
}
