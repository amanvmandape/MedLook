package com.medlook.repository;

import com.medlook.entity.City;
import com.medlook.entity.Doctor;
import com.medlook.enums.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByCityAndSpeciality(City city, Speciality speciality);
}