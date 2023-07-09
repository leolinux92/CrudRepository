package com.crud.example.crudproject.repository;

import com.crud.example.crudproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {


    List<User> findByPlaceOfBirth(String placeOfBirth);
}
