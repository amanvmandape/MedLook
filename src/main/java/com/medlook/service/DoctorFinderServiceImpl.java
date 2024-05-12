package com.medlook.service;

import com.medlook.entity.DiseaseIndex;
import com.medlook.entity.Doctor;
import com.medlook.entity.Patient;
import com.medlook.enums.DocCities;
import com.medlook.repository.DiseaseIndexRepository;
import com.medlook.repository.DoctorRepository;
import com.medlook.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorFinderServiceImpl implements DoctorFinderService {
    private  final PatientRepository pr;
    private final DoctorRepository dr;
    private final DiseaseIndexRepository dir;
    @Override
    public List<Doctor> findDoctors(long patientId) {
        Patient patient = pr.findById(patientId).get();
        try
        {
            DocCities city = DocCities.valueOf(patient.getCity());
            DiseaseIndex diseaseIndex = dir.findBySymptom(patient.getSymptom());
            return dr.findBySpecialityAndCity(diseaseIndex.getSpeciality(), city);
        }
        catch(Exception e)
        {

        }
        return null;
    }

}
