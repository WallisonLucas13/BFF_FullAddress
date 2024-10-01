package com.example.api.bff.domain.addressPreview.usecases;

import com.example.api.bff.domain.addressPreview.models.AddressPreview;
import com.example.api.bff.domain.addressPreview.ports.AddressPreviewPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class AddressPreviewIntegrationImpl implements AddressPreviewIntegration{

    private final AddressPreviewPort port;

    @Override
    public AddressPreview findAddressPreviewByCep(final String cep) throws URISyntaxException {
        return port.findAddressPreviewByCep(cep);
    }
}
