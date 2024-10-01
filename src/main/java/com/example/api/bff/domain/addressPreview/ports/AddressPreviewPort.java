package com.example.api.bff.domain.addressPreview.ports;

import com.example.api.bff.domain.addressPreview.models.AddressPreview;

import java.net.URISyntaxException;

public interface AddressPreviewPort {
    /**
     * @param cep
     * @return AddressPreview objeto que contem parte de um endereço completo
     * @throws URISyntaxException
     */
    AddressPreview findAddressPreviewByCep(String cep) throws URISyntaxException;

}
