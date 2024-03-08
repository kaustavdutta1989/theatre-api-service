package com.riko.theatre.repo;

import com.riko.theatre.model.City;
import com.riko.theatre.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityRepository extends JpaRepository<City, Long> {
}
