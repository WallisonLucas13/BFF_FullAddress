package com.example.api.bff.domain.fullAddress.usecases;

import com.example.api.bff.domain.fullAddress.models.FullAddress;
import jakarta.validation.constraints.NotNull;

import java.net.URISyntaxException;

public interface FullAddressIntegration {
    /**
     * @param cep
     * @return FullAddress objeto com o endereço completo
     * @throws URISyntaxException
     */
    FullAddress createFullAddress(@NotNull String cep) throws URISyntaxException;
}
