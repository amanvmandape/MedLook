package com.medlook.entity;

import com.medlook.enums.Speciality;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(min=3)
    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Email
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Size(min=10)
    @Column(name = "phone_no", nullable = false, length = 20)
    private String phoneNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "speciality", nullable = false)
    private Speciality speciality;
}