package com.medlook.controller;

import com.medlook.entity.DiseaseIndex;
import com.medlook.service.DiseaseIndexService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/app/disease-index")
public class DiseaseIndexController {
    private final DiseaseIndexService dis;
    @PostMapping("/add")
    public ResponseEntity<DiseaseIndex> add(@RequestBody DiseaseIndex diseaseIndex)
    {
        DiseaseIndex saved = dis.add(diseaseIndex);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
