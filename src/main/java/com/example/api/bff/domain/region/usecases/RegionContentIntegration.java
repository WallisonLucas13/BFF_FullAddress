package com.example.api.bff.domain.region.usecases;

import com.example.api.bff.domain.region.models.RegionContent;

import java.net.URISyntaxException;

public interface RegionContentIntegration {
    /**
     * @param uf sigla do Estado.
     * @return RegionContent objeto com a região completa.
     * @throws URISyntaxException
     */
    RegionContent findRegionContentByUf(String uf) throws URISyntaxException;
}
