package com.example.miniprojet.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity


public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AddressId;

    private String adressName;
    private String addressLandMark;
    private String addressState;
    private String addressPhoneNumber;
    private String addressZipCode;

    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;

}

