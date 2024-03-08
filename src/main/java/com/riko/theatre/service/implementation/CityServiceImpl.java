package com.riko.theatre.service.implementation;

import com.riko.theatre.model.City;
import com.riko.theatre.model.dto.CityMinDTO;
import com.riko.theatre.repo.CityRepository;
import com.riko.theatre.service.CityService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City createCity(CityMinDTO cityMinDTO) {
        return cityRepository.save(City.builder()
                .name(cityMinDTO.getName())
                .build());
    }

    @Override
    public City getCityById(Long id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("city not found with id: " + id));
    }
}
