package com.medlook.service;

import com.medlook.entity.Doctor;

import java.util.List;

public interface DoctorFinderService {
    List<Doctor> findDoctors(long patientId);
}
