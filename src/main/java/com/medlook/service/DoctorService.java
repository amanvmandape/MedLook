package com.medlook.service;

import com.medlook.entity.Doctor;

public interface DoctorService {
    Doctor addDoctor(Doctor doc);

    Doctor delDoctor(long id);
}
