package com.example.api.bff.domain.address.usecases;

import com.example.api.bff.domain.address.converters.AddressPreviewConverter;
import com.example.api.bff.domain.address.models.AddressPreview;
import com.example.api.bff.domain.address.ports.AddressPreviewPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class AddressPreviewIntegrationImpl implements AddressPreviewIntegration{

    private final AddressPreviewPort port;

    @Override
    public AddressPreview findAddressPreviewByCep(String cep) throws URISyntaxException {
        return port.findAddressPreviewByCep(cep);
    }
}
