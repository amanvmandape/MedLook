package com.medlook.service;

import com.medlook.entity.Patient;
import com.medlook.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient delPatient(long id) {
        Patient patient = patientRepository.findById(id).get();
        patientRepository.delete(patient);
        return patient;
    }
}
