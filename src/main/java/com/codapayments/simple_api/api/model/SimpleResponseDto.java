package com.codapayments.simple_api.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class SimpleResponseDto {
    private String game;

    @JsonProperty("gamer_id")
    private String gamerId;

    private Integer points;
}
