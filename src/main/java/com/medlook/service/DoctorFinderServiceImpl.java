package com.medlook.service;

import com.medlook.entity.City;
import com.medlook.entity.DiseaseIndex;
import com.medlook.entity.Doctor;
import com.medlook.entity.Patient;
import com.medlook.exception.ResourceNotFound;
import com.medlook.repository.CityRepository;
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
    private final CityRepository cityRepository;

    @Override
    public List<Doctor> findDoctors(long patientId) {
        Patient patient = pr.findById(patientId).orElseThrow(()->new ResourceNotFound("Patient not found"));
        City city = cityRepository.findByName(patient.getCity())
                .orElseThrow(()->new ResourceNotFound("We are still waiting to expand to your location"));
        DiseaseIndex diseaseIndex = dir.findBySymptom(patient.getSymptom());
        List<Doctor> docs = dr.findByCityAndSpeciality(city, diseaseIndex.getSpeciality());
        if(docs.isEmpty())
        {
            throw new ResourceNotFound("There isn't any doctor present at your location for your symptom");
        }
        return docs;
    }

}
