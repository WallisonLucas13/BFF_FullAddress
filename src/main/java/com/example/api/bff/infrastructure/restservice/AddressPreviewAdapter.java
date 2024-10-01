package com.example.api.bff.infrastructure.restservice;

import com.example.api.bff.domain.address.inputs.AddressPreviewInput;
import com.example.api.bff.domain.address.models.AddressPreview;
import com.example.api.bff.domain.address.ports.AddressPreviewPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

@Component
@Slf4j
public class AddressPreviewAdapter implements AddressPreviewPort {

    private final RestTemplate restTemplate;

    private final String BFF_ADDRESS_API_URL;

    public AddressPreviewAdapter(RestTemplate restTemplate,
                                 @Value("${bff.address.api.url}") String BFF_ADDRESS_API_URL){

        this.restTemplate = restTemplate;
        this.BFF_ADDRESS_API_URL = BFF_ADDRESS_API_URL;
    }

    @Override
    public AddressPreview findAddressPreviewByCep(String cep) throws URISyntaxException {
        var uri = new URI(this.BFF_ADDRESS_API_URL + cep);

        return this.restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                AddressPreview.class
        ).getBody();
    }
}
