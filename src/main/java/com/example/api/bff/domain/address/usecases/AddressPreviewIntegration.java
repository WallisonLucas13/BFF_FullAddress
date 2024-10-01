package com.example.api.bff.domain.address.usecases;

import com.example.api.bff.domain.address.models.AddressPreview;
import jakarta.validation.constraints.NotNull;

import java.net.URISyntaxException;

public interface AddressPreviewIntegration {

    AddressPreview findAddressPreviewByCep(@NotNull String cep) throws URISyntaxException;
}
