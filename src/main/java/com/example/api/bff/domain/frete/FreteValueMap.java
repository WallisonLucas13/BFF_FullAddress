package com.example.api.bff.domain.frete;

import jakarta.validation.constraints.NotNull;

import java.util.Map;

public final class FreteValueMap {

    private static final Map<String, Double> regionMap = Map.of(
            "Sudeste", 7.85,
            "Norte", 20.83,
            "Nordeste", 15.98,
            "Centro-Oeste", 12.50,
            "Sul", 17.30
    );

    public static Double getFreteByRegion(@NotNull String region){
        return regionMap.get(region) == null ? 0.0 : regionMap.get(region);
    }
}
