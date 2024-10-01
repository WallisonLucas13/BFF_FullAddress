package com.example.api.bff.domain.region.ports;

import com.example.api.bff.domain.region.models.RegionContent;

import java.net.URISyntaxException;

public interface RegionContentPort {
    /**
     * @param uf sigla do Estado.
     * @return RegionContent objeto com a região completa
     * @throws URISyntaxException
     */
    RegionContent findRegionContentByUf(String uf) throws URISyntaxException;
}
