package com.example.api.bff.domain.region.usecases;

import com.example.api.bff.domain.region.converters.RegionContentConverter;
import com.example.api.bff.domain.region.models.RegionContent;
import com.example.api.bff.domain.region.ports.RegionContentPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class RegionContentIntegrationImpl implements RegionContentIntegration{

    private final RegionContentPort port;

    @Override
    public RegionContent findRegionContentByUf(String uf) throws URISyntaxException{
        return port.findRegionContentByUf(uf);
    }
}
