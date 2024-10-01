package com.example.api.bff.domain.address.ports;

import com.example.api.bff.domain.address.inputs.AddressPreviewInput;
import com.example.api.bff.domain.address.models.AddressPreview;

import java.net.URISyntaxException;

public interface AddressPreviewPort {

    AddressPreview findAddressPreviewByCep(String cep) throws URISyntaxException;

}
