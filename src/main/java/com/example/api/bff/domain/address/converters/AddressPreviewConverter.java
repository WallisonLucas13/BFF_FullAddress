package com.example.api.bff.domain.address.converters;

import com.example.api.bff.domain.address.inputs.AddressPreviewInput;
import com.example.api.bff.domain.address.models.AddressPreview;

public final class AddressPreviewConverter {
    public static AddressPreview inputToModel(AddressPreviewInput input){
        return AddressPreview.builder()
                .bairro(input.getBairro())
                .cep(input.getCep())
                .ddd(input.getDdd())
                .gia(input.getGia())
                .uf(input.getUf())
                .siafi(input.getSiafi())
                .ibge(input.getIbge())
                .complemento(input.getComplemento())
                .localidade(input.getLocalidade())
                .logradouro(input.getLogradouro())
                .unidade(input.getUnidade())
                .build();
    }
}
