package com.riko.theatre.client.service.implementation;

import com.riko.theatre.client.PartnerApiClient;
import com.riko.theatre.client.model.User;
import com.riko.theatre.client.service.PartnerApiService;
import com.riko.theatre.model.Theatre;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PartnerApiServiceImpl implements PartnerApiService {

    private final PartnerApiClient partnerApiClient;

    @Override
    public User getPartnerById(Long id) {
        try {
            User partner = partnerApiClient.getPartnerById(id).getBody();
            log.info("partner found {}", partner);
            return partner;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("partner not found with id: " + id);
        }
    }
}
