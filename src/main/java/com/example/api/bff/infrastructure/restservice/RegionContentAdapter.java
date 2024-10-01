package com.example.api.bff.infrastructure.restservice;

import com.example.api.bff.domain.region.models.RegionContent;
import com.example.api.bff.domain.region.ports.RegionContentPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@Slf4j
public class RegionContentAdapter extends RestClientAdapter implements RegionContentPort {

    private final String BFF_REGION_API_URL;

    public RegionContentAdapter(final RestClient restClient,
                                @Value("${bff.region.api.url}") final String BFF_REGION_API_URL){
        super(restClient);
        this.BFF_REGION_API_URL = BFF_REGION_API_URL;
    }

    @Override
    public RegionContent findRegionContentByUf(final String uf) throws URISyntaxException {
        var uri = new URI(String.format("%s%s", this.BFF_REGION_API_URL, uf));
        return this.get(uri, RegionContent.class);
    }
}
