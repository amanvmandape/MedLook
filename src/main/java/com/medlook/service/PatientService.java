package com.medlook.service;

import com.medlook.entity.Patient;

public interface PatientService {
    Patient addPatient(Patient patient);

    Patient delPatient(long id);
}
