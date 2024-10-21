package com.codapayments.simple_api.service;

import com.codapayments.simple_api.api.model.SimpleRequestDto;
import com.codapayments.simple_api.api.model.SimpleResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SimpleService {

    public SimpleResponseDto postRequest(final SimpleRequestDto request) {
        log.debug("Request Body: {}", request);
        try{
            final SimpleResponseDto response = SimpleResponseDto.builder()
                    .game(request.game())
                    .gamerId(request.gamerId())
                    .points(request.points())
                    .build();
            log.debug("Response Body: {}", response);
            return response;
        }
        catch (Exception e) {
            log.error("Exception occurred while posting request: {}", e.getLocalizedMessage());
            throw e;
        }
    }
}
