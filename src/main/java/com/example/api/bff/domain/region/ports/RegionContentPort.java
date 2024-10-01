package com.example.api.bff.domain.region.ports;

import com.example.api.bff.domain.region.inputs.RegionContentInput;
import com.example.api.bff.domain.region.models.RegionContent;

import java.net.URISyntaxException;

public interface RegionContentPort {

    RegionContent findRegionContentByUf(String uf) throws URISyntaxException;
}
