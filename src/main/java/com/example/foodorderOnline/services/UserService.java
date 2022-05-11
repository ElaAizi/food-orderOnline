package com.example.foodorderOnline.services;

import com.example.foodorderOnline.models.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userDto);

    UserDto update(UserDto userDto);

    UserDto findById(UserDto userDto);

    List<UserDto> findAll(UserDto userDto);
}
