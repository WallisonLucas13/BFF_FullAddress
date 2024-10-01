package com.example.api.bff.infrastructure.api.controllers.v1;

import com.example.api.bff.domain.fullAddress.usecases.FullAddressIntegration;
import com.example.api.bff.infrastructure.api.controllers.v1.doc.FullAddressControllerSwagger;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/bff/api/v1/fullAddress")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FullAddressController implements FullAddressControllerSwagger {

    private final FullAddressIntegration integration;

    @GetMapping
    @Override
    public ResponseEntity<Object> findFullAddressByCep(@RequestParam("cep") final String cep) throws URISyntaxException {
        return ResponseEntity.status(HttpStatus.OK)
                .body(integration.createFullAddress(cep));
    }
}
