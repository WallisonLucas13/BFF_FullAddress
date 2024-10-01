package com.example.api.bff.domain.region.usecases;

import com.example.api.bff.domain.region.models.RegionContent;
import jakarta.validation.constraints.NotNull;

import java.net.URISyntaxException;

public interface RegionContentIntegration {

    RegionContent findRegionContentByUf(@NotNull String uf) throws URISyntaxException;
}
