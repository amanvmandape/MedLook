package com.medlook.repository;

import com.medlook.entity.DiseaseIndex;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseIndexRepository extends JpaRepository<DiseaseIndex, Long> {
}