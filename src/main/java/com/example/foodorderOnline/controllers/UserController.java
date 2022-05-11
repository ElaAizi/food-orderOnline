package com.example.foodorderOnline.controllers;

import com.example.foodorderOnline.models.dto.UserDto;
import com.example.foodorderOnline.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserDto save(@RequestBody UserDto userDto){
        return userService.save(userDto);
    }
    @PutMapping("/update")
    public UserDto update(@RequestBody UserDto userDto){
        return userService.update(userDto);
    }
    @GetMapping("/get")
    public UserDto findById(@RequestParam Long id){
        return userService.findById(findById(id));
    }
    @GetMapping("/list")
    public List<UserDto> findAll(){
        return null;
    }

}
