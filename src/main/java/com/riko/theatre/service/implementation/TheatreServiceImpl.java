package com.riko.theatre.service.implementation;

import com.riko.theatre.client.model.User;
import com.riko.theatre.client.service.PartnerApiService;
import com.riko.theatre.model.City;
import com.riko.theatre.model.Theatre;
import com.riko.theatre.model.dto.TheatreMinDTO;
import com.riko.theatre.repo.TheatreRepository;
import com.riko.theatre.service.CityService;
import com.riko.theatre.service.TheatreService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TheatreServiceImpl implements TheatreService {

    private final TheatreRepository theatreRepository;
    private final CityService cityService;
    private final PartnerApiService partnerApiService;

    @Override
    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }

    @Override
    public Theatre getTheatreById(Long id) {
        return theatreRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("theatre not found with id: " + id));
    }

    @Override
    public Theatre createTheatre(TheatreMinDTO theatreMinDTO) {
        return theatreRepository.save(Theatre.builder()
                .name(theatreMinDTO.getName())
                .location(theatreMinDTO.getLocation())
                .partnerId(partnerApiService.getPartnerById(theatreMinDTO.getPartnerId()).getId())
                .city(cityService.getCityById(theatreMinDTO.getCityId()))
                .build());
    }

    @Override
    public List<Theatre> getTheatresByCity(Long cityId) {
        return theatreRepository.findByCity(cityService.getCityById(cityId));
    }
}
