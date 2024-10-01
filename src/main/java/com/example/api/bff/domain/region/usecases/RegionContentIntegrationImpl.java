package com.example.api.bff.domain.region.usecases;

import com.example.api.bff.domain.region.models.RegionContent;
import com.example.api.bff.domain.region.ports.RegionContentPort;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class RegionContentIntegrationImpl implements RegionContentIntegration{

    private final RegionContentPort port;

    @Override
    public RegionContent findRegionContentByUf(@NotNull final String uf) throws URISyntaxException{
        return port.findRegionContentByUf(uf);
    }
}
