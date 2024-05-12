package com.medlook.service;

import com.medlook.entity.City;
import com.medlook.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cr;
    @Override
    public City addCity(City city) {
        return cr.save(city);
    }
}
