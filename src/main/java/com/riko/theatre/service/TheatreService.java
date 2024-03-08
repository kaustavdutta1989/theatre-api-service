package com.riko.theatre.service;

import com.riko.theatre.model.City;
import com.riko.theatre.model.Theatre;
import com.riko.theatre.model.dto.TheatreMinDTO;

import java.util.List;

public interface TheatreService {

    List<Theatre> getAllTheatres();
    Theatre getTheatreById(Long id);
    Theatre createTheatre(TheatreMinDTO theatreMinDTO);
    List<Theatre> getTheatresByCity(Long cityId);
}
