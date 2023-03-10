package com.example.hibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class BasePerson implements Serializable {
    private String name;
    private String surname;
    private int age;
}

