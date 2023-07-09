package com.crud.example.crudproject.controller;


import com.crud.example.crudproject.entity.User;
import com.crud.example.crudproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {


    @Autowired
    UserService userService;


    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userService.createUser(user);
    }


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/userById/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }


    @GetMapping("/userByPlace/{placeOfBirth}")
    public List<User> getUserByPlaceOfBirth(@PathVariable String placeOfBirth){
        return userService.getUserByPlaceOfBirth(placeOfBirth);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUserById(id);
    }


    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUserById(user);
    }


}
