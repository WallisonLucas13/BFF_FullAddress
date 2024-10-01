package com.example.api.bff.domain.addressPreview.usecases;

import com.example.api.bff.domain.addressPreview.models.AddressPreview;
import jakarta.validation.constraints.NotNull;

import java.net.URISyntaxException;

public interface AddressPreviewIntegration {
    /**
     * @param cep
     * @return AddressPreview objeto que contem parte de um endereço completo
     * @throws URISyntaxException
     */
    AddressPreview findAddressPreviewByCep(@NotNull String cep) throws URISyntaxException;
}
