package com.riko.theatre.client;

import com.riko.theatre.client.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "${feign.client.partner.name}",
        url = "${feign.client.partner.url}",
        path = "${feign.client.partner.path}"
)
public interface PartnerApiClient {

    @GetMapping("/{id}")
    ResponseEntity<User> getPartnerById(@PathVariable Long id);
}
