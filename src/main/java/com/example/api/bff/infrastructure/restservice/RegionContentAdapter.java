package com.example.api.bff.infrastructure.restservice;

import com.example.api.bff.domain.region.inputs.RegionContentInput;
import com.example.api.bff.domain.region.models.RegionContent;
import com.example.api.bff.domain.region.ports.RegionContentPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

@Component
@Slf4j
public class RegionContentAdapter implements RegionContentPort {

    private final RestTemplate restTemplate;

    private final String BFF_REGION_API_URL;

    public RegionContentAdapter(RestTemplate restTemplate,
                                @Value("${bff.region.api.url}") String BFF_REGION_API_URL){
        this.restTemplate = restTemplate;
        this.BFF_REGION_API_URL = BFF_REGION_API_URL;
    }

    @Override
    public RegionContent findRegionContentByUf(String uf) throws URISyntaxException {
        log.info(this.BFF_REGION_API_URL + uf);
        var uri = new URI(this.BFF_REGION_API_URL + uf);

        var response = this.restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                RegionContent.class
            );

        return response.getBody();
    }
}
