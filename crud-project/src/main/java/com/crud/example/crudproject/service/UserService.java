package com.crud.example.crudproject.service;


import com.crud.example.crudproject.entity.User;
import com.crud.example.crudproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int userId){
        return userRepository.findById(userId).orElse(null);
    }

    public List<User> getUserByPlaceOfBirth(String placeOfBirth){
        return userRepository.findByPlaceOfBirth(placeOfBirth);
    }

    public String deleteUserById(int userId){
        userRepository.deleteById(userId);
        return "User with id "+ userId+" deleted!";
    }

    public User updateUserById(User user){
        User userEx = userRepository.findById(user.getId()).orElse(null);
        userEx.setFirstName(user.getFirstName());
        userEx.setLastName(user.getLastName());
        userEx.setGender(user.getGender());
        userEx.setDateOfBirth(user.getDateOfBirth());
        userEx.setPlaceOfBirth(user.getPlaceOfBirth());
        return userRepository.save(userEx);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }




}
