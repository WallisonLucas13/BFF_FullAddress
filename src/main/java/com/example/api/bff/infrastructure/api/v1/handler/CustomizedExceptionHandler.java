package com.example.api.bff.infrastructure.api.v1.handler;

import com.example.api.bff.infrastructure.api.v1.responses.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class CustomizedExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<ErrorResponse> handlerHttpClientNotFound(final HttpClientErrorException.NotFound ex){
        ErrorResponse errorResponse = ex.getResponseBodyAs(ErrorResponse.class);
        return new ResponseEntity<>(errorResponse, ex.getStatusCode());
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<ErrorResponse> handlerHttpClientBadRequest(final HttpClientErrorException.BadRequest ex){
        ErrorResponse errorResponse = ex.getResponseBodyAs(ErrorResponse.class);
        return new ResponseEntity<>(errorResponse, ex.getStatusCode());
    }

}
