package com.riko.theatre.controller;

import com.riko.theatre.model.Theatre;
import com.riko.theatre.model.dto.TheatreMinDTO;
import com.riko.theatre.service.TheatreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
/*@RequestMapping("")*/
public class TheatreController {
    private final TheatreService theatreService;

    @GetMapping
    public ResponseEntity<List<Theatre>> getAllTheatres() {
        return ResponseEntity.ok(theatreService.getAllTheatres());
    }

    @PostMapping
    public ResponseEntity<Theatre> createTheatre(@RequestBody TheatreMinDTO theatreMinDTO) {
        return ResponseEntity.ok(theatreService.createTheatre(theatreMinDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Theatre> getTheatreById(@PathVariable Long id) {
        return ResponseEntity.ok(theatreService.getTheatreById(id));
    }

    @GetMapping("/theatre/city/{id}")
    public ResponseEntity<List<Theatre>> getTheatreByCityId(@PathVariable Long id) {
        return ResponseEntity.ok(theatreService.getTheatresByCity(id));
    }
}
