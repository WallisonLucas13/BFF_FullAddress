package com.example.api.bff.domain.region.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegionContent {
    private String sigla;
    private String nome;
    @JsonProperty("regiao")
    private RegionModel region;
}
