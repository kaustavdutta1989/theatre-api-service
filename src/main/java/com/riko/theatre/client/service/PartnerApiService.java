package com.riko.theatre.client.service;

import com.riko.theatre.client.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface PartnerApiService {
    User getPartnerById(Long id);
}
