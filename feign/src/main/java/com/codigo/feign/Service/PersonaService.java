package com.codigo.feign.Service;

import com.codigo.feign.Aggregates.Request.PersonaRequest;
import com.codigo.feign.Aggregates.Response.BaseResponse;

public interface PersonaService {

    BaseResponse crearPersona(PersonaRequest personaRequest);
    BaseResponse getInfoReniec(String dni);
}
