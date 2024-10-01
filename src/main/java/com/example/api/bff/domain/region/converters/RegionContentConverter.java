package com.example.api.bff.domain.region.converters;

import com.example.api.bff.domain.region.inputs.RegionContentInput;
import com.example.api.bff.domain.region.models.RegionContent;

public final class RegionContentConverter {

    public static RegionContent inputToModel(RegionContentInput input){
        return RegionContent.builder()
                .nome(input.getNome())
                .sigla(input.getSigla())
                .region(input.getRegion())
                .build();
    }
}
