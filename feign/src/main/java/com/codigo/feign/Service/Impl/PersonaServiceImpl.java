package com.codigo.feign.Service.Impl;

import com.codigo.feign.Aggregates.Constants.Constants;
import com.codigo.feign.Aggregates.Request.PersonaRequest;
import com.codigo.feign.Aggregates.Response.BaseResponse;
import com.codigo.feign.Aggregates.Response.ReniecResponse;
import com.codigo.feign.FeignClient.ReniecClient;
import com.codigo.feign.Repository.PersonaRepository;
import com.codigo.feign.Service.PersonaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    private final ReniecClient reniecClient;

    public PersonaServiceImpl(PersonaRepository personaRepository, ReniecClient reniecClient) {
        this.personaRepository = personaRepository;
        this.reniecClient = reniecClient;
    }

    @Value("${token.api}")
    public String tokenApi;
    @Override
    public BaseResponse crearPersona(PersonaRequest personaRequest) {


        return null;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {

        ReniecResponse response = getExcution(numero);
        if(response != null)
        {
            return new BaseResponse(Constants.CODE_SUCCESS, Constants.MESS_SUCCESS, Optional.of(response));
        }
        else
        {
            return new BaseResponse(Constants.CODE_ERROR, Constants.MESS_ERROR, Optional.empty());
        }

    }

    private ReniecResponse getExcution(String numero){
        String authorization = "Bearer "+tokenApi;
        return reniecClient.getInfo(numero,authorization);

    }

}
