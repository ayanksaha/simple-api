package com.codapayments.simple_api.api.controller;

import com.codapayments.simple_api.api.model.SimpleRequestDto;
import com.codapayments.simple_api.api.model.SimpleResponseDto;
import com.codapayments.simple_api.api.model.StatusResponseDto;
import com.codapayments.simple_api.service.SimpleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SimpleController {
    private static final String STATUS_OK = "OK";
    @Autowired
    private SimpleService service;

    @PostMapping("/simple/api")
    public ResponseEntity<SimpleResponseDto> postRequest(@RequestBody SimpleRequestDto request) {
        log.info("Request Received..");
        final SimpleResponseDto response = service.postRequest(request);
        log.info("Response sent..");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/health")
    public ResponseEntity<StatusResponseDto> health() {
        log.info("Status sent..");
        return ResponseEntity.ok(StatusResponseDto.builder().status(STATUS_OK).build());
    }
}
