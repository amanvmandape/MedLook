package com.medlook.controller;

import com.medlook.entity.Patient;
import com.medlook.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/app/patients")
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/add")
    public ResponseEntity<Patient> addDoctor(@Valid @RequestBody Patient patient) {
        Patient saved = patientService.addPatient(patient);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Patient> addDoctor(@PathVariable("id") long patientId) {
        Patient deleted = patientService.delPatient(patientId);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }
}
