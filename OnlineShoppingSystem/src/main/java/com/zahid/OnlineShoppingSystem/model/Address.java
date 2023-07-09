package com.zahid.OnlineShoppingSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String landmark;

    private String phoneNumber;

    private String zipcode;

    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}

