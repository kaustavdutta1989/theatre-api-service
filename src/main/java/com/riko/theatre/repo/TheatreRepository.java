package com.riko.theatre.repo;

import com.riko.theatre.model.City;
import com.riko.theatre.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    List<Theatre> findByCity(City city);
}
