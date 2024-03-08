package com.riko.theatre.service;

import com.riko.theatre.model.City;
import com.riko.theatre.model.dto.CityMinDTO;

import java.util.List;

public interface CityService {
    List<City> getAllCities();
    City createCity(CityMinDTO cityMinDTO);
    City getCityById(Long id);
}
