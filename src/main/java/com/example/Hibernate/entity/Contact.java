package com.example.Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Contact implements Serializable {
    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = false, length = 30)
    private String surname;
    @Column(nullable = false, length = 3)
    private int age;
}
