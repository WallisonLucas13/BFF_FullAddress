package com.example.api.bff.infrastructure.api.controllers.v1.doc;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

@Tag(name = "address_api")
public interface FullAddressControllerSwagger {

    @Operation(summary = "Realiza a busca de um endereço completo por meio de um cep", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Consulta de endereço realizada com sucesso!"),
            @ApiResponse(responseCode = "404", description = "Endereço não encontrado, verifique o cep!"),
            @ApiResponse(responseCode = "400", description = "Cep com formato incorreto!"),
            @ApiResponse(responseCode = "500", description = "Falha no servidor!")
    }
    )
    ResponseEntity<Object> findFullAddressByCep(String cep) throws URISyntaxException;
}
