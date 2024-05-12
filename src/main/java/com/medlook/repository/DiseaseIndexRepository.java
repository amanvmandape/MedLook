package com.medlook.repository;

import com.medlook.entity.DiseaseIndex;
import com.medlook.enums.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseIndexRepository extends JpaRepository<DiseaseIndex, Long> {
    DiseaseIndex findBySymptom(Symptom symptom);
}