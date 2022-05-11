package com.example.foodorderOnline.mappers;

import com.example.foodorderOnline.models.dto.OrderDto;
import com.example.foodorderOnline.models.dto.UserDto;
import com.example.foodorderOnline.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);

    List<User> userDtoListToUserList(List<UserDto> UserDtos);

    List<UserDto> userListToUserDtoList(List<User> users);
}
