package com.example.api.bff.domain.fullAddress.usecases;

import com.example.api.bff.domain.address.usecases.AddressPreviewIntegration;
import com.example.api.bff.domain.frete.FreteValueMap;
import com.example.api.bff.domain.fullAddress.converters.FullAddressConverter;
import com.example.api.bff.domain.fullAddress.models.FullAddress;
import com.example.api.bff.domain.region.usecases.RegionContentIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class FullAddressIntegrationImpl implements FullAddressIntegration{

    private final AddressPreviewIntegration addressPreviewIntegration;

    private final RegionContentIntegration regionContentIntegration;

    @Override
    public FullAddress createFullAddress(String cep) throws URISyntaxException{
        var addressPreview = addressPreviewIntegration.findAddressPreviewByCep(cep);
        var regionPreview = regionContentIntegration.findRegionContentByUf(addressPreview.getUf());

        var fullAddress = FullAddressConverter.inputToModel(
                addressPreview,
                regionPreview
        );

        //Define o valor do frete de acordo com a Região encontrada
        fullAddress.setFrete(FreteValueMap.getFreteByRegion(fullAddress.getRegion()));

        return fullAddress;
    }
}
