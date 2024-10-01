package com.example.api.bff.domain.addressPreview.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressPreview {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
