package com.codapayments.simple_api.api.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StatusResponseDto {
    private String status;
}
