package com.devsuperior.dscommerce.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import org.hibernate.generator.values.internal.GeneratedValuesImpl;

import java.time.LocalDate;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;

    public User() {
    }

    public User(Long id, String name, String email, String phone, LocalDate birthDate, LocalDate password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.password = password;
    }
}
