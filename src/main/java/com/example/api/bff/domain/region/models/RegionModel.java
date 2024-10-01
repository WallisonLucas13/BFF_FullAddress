package com.example.api.bff.domain.region.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegionModel {
    private String sigla;
    private String nome;
}
