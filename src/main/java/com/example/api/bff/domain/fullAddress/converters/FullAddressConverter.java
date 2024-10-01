package com.example.api.bff.domain.fullAddress.converters;

import com.example.api.bff.domain.address.models.AddressPreview;
import com.example.api.bff.domain.fullAddress.models.FullAddress;
import com.example.api.bff.domain.region.models.RegionContent;

public final class FullAddressConverter {

    public static FullAddress inputToModel(AddressPreview addressPreview
            , RegionContent regionContent){

        return FullAddress.builder()
                .bairro(addressPreview.getBairro())
                .gia(addressPreview.getGia())
                .ibge(addressPreview.getIbge())
                .uf(addressPreview.getUf())
                .siafi(addressPreview.getSiafi())
                .ddd(addressPreview.getDdd())
                .complemento(addressPreview.getComplemento())
                .cep(addressPreview.getCep())
                .localidade(addressPreview.getLocalidade())
                .unidade(addressPreview.getUnidade())
                .logradouro(addressPreview.getLogradouro())
                .region(regionContent.getRegion().getNome())
                .build();
    }
}
