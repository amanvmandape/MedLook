package com.medlook.service;

import com.medlook.entity.DiseaseIndex;
import com.medlook.repository.DiseaseIndexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiseaseIndexServiceImpl implements DiseaseIndexService {
    private final DiseaseIndexRepository dir;
    @Override
    public DiseaseIndex add(DiseaseIndex diseaseIndex) {
        return dir.save(diseaseIndex);
    }
}
