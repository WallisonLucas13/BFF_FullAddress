package com.example.api.bff.domain.region.inputs;

import com.example.api.bff.domain.region.models.RegionModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegionContentInput {
    private String sigla;
    private String nome;
    @JsonProperty("regiao")
    private RegionModel region;
}
