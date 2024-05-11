package com.medlook.entity;

import com.medlook.enums.Speciality;
import com.medlook.enums.Symptom;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "disease_index")
public class DiseaseIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "symptom", nullable = false, unique = true)
    private Symptom symptom;

    @Enumerated(EnumType.STRING)
    @Column(name = "speciality", nullable = false)
    private Speciality speciality;

}