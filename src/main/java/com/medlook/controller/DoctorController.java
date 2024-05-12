package com.medlook.controller;

import com.medlook.entity.Doctor;
import com.medlook.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/app/doctors")
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        Doctor saved = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Doctor> addDoctor(@PathVariable("id") long doctorId) {
        Doctor deleted = doctorService.delDoctor(doctorId);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }
}
