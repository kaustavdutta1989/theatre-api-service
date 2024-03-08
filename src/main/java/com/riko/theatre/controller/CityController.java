package com.riko.theatre.controller;

import com.riko.theatre.model.City;
import com.riko.theatre.model.dto.CityMinDTO;
import com.riko.theatre.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> getAllCities() {
        return ResponseEntity.ok(cityService.getAllCities());
    }

    @PostMapping
    public ResponseEntity<City> createCity(@RequestBody CityMinDTO cityMinDTO) {
        return ResponseEntity.ok(cityService.createCity(cityMinDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) {
        return ResponseEntity.ok(cityService.getCityById(id));
    }
}
