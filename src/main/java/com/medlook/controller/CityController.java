package com.medlook.controller;

import com.medlook.entity.City;
import com.medlook.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/cities")
@RequiredArgsConstructor
public class CityController {

    private final CityService cs;
    @PostMapping("/add")
    public ResponseEntity<City> addCity(@RequestBody City city)
    {
        City saved = cs.addCity(city);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
