package com.example.api.bff.infrastructure.restservice;

import com.example.api.bff.domain.address.models.AddressPreview;
import com.example.api.bff.domain.address.ports.AddressPreviewPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@Slf4j
public class AddressPreviewAdapter extends RestClientAdapter implements AddressPreviewPort {

    private final String BFF_ADDRESS_API_URL;

    public AddressPreviewAdapter(final RestClient restClient,
                                 @Value("${bff.address.api.url}") final String BFF_ADDRESS_API_URL){
        super(restClient);
        this.BFF_ADDRESS_API_URL = BFF_ADDRESS_API_URL;
    }

    @Override
    public AddressPreview findAddressPreviewByCep(String cep) throws URISyntaxException {
        var uri = new URI(String.format("%s%s", this.BFF_ADDRESS_API_URL, cep));
        return this.get(uri, AddressPreview.class);
    }
}
