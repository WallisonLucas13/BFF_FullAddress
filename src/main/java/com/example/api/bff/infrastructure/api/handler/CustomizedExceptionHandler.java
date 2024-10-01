package com.example.api.bff.infrastructure.api.handler;

import com.example.api.bff.infrastructure.api.responses.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@ControllerAdvice
public class CustomizedExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<ErrorResponse> handlerHttpClientNotFound(final HttpClientErrorException.NotFound ex,
                                                                   final HttpServletRequest request){
        return new ResponseEntity<>(convertToErrorResponseAndSetPath(ex, request),
                ex.getStatusCode());
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<ErrorResponse> handlerHttpClientBadRequest(final HttpClientErrorException.BadRequest ex,
                                                                     final HttpServletRequest request){
        return new ResponseEntity<>(convertToErrorResponseAndSetPath(ex, request),
                ex.getStatusCode());
    }

    private ErrorResponse convertToErrorResponseAndSetPath(final HttpClientErrorException ex,
                                                           final HttpServletRequest request){
        String path = request.getServletPath();
        Optional<ErrorResponse> errorResponse =
                Optional.ofNullable(ex.getResponseBodyAs(ErrorResponse.class));

        if(errorResponse.isEmpty()){
            return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                    "Erro interno, por favor contate o administrador do sistema!",
                    path);
        }

        errorResponse.get().setPath(request.getServletPath());
        return errorResponse.get();
    }

}
