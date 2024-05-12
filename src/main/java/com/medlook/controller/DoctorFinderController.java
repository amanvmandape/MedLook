package com.medlook.controller;

import com.medlook.entity.Doctor;
import com.medlook.service.DoctorFinderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/find-doctors")
@RequiredArgsConstructor
public class DoctorFinderController {
    private final DoctorFinderService doctorFinderService;;

    @GetMapping
    public ResponseEntity<?> findDoctors(@RequestParam("id") long patientId)
    {
        List<Doctor> doctors = doctorFinderService.findDoctors(patientId);
        return new ResponseEntity<>(doctors, HttpStatus.OK);
//        return new ResponseEntity<>(, HttpStatus.NOT_FOUND);
    }
}
