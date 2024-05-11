package com.medlook.entity;

import com.medlook.enums.Symptom;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(min = 3)
    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @Size(max = 20)
    @Column(name = "city", nullable = false, length = 20)
    private String city;

    @Email
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Size(min = 10)
    @Column(name = "phone_no", nullable = false, length = 20)
    private String phoneNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "symptom", nullable = false)
    private Symptom symptom;

}