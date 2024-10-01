package com.example.api.bff.domain.fullAddress.usecases;

import com.example.api.bff.domain.address.models.AddressPreview;
import com.example.api.bff.domain.fullAddress.models.FullAddress;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.net.URISyntaxException;

public interface FullAddressIntegration {

    FullAddress createFullAddress(@NotNull String cep) throws URISyntaxException;
}
