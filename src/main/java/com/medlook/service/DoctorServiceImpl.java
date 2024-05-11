package com.medlook.service;

import com.medlook.entity.Doctor;
import com.medlook.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public Doctor addDoctor(Doctor doc) {
        return doctorRepository.save(doc);
    }

    @Override
    public Doctor delDoctor(long id) {
        Doctor doctor = doctorRepository.findById(id).get();
        doctorRepository.delete(doctor);
        return doctor;
    }
}
