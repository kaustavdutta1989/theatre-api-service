package com.riko.theatre.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheatreMinDTO {
    private String name;
    private Long partnerId;
    private Long cityId;
    private String location;
}
