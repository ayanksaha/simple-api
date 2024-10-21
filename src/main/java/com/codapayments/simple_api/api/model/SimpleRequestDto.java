package com.codapayments.simple_api.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SimpleRequestDto(
    String game,
    @JsonProperty("gamer_id") String gamerId,
    Integer points) {
}
