package com.example.miniprojet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String UserEmail;

    private String userPassword;

    private String userPhoneNo;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    private Address address;
}