package com.crud.example.crudproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_USR_USER")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String placeOfBirth;
    @Column
    private Date dateOfBirth;
    @Column
    private String gender;




}
