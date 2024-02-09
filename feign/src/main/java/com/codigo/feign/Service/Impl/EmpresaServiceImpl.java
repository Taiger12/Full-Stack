package com.codigo.feign.Service.Impl;

import com.codigo.feign.Aggregates.Constants.Constants;
import com.codigo.feign.Aggregates.Request.EmpresaRequest;
import com.codigo.feign.Aggregates.Response.BaseResponse;
import com.codigo.feign.Aggregates.Response.EmpresaResponse;
import com.codigo.feign.Aggregates.Response.ReniecResponse;
import com.codigo.feign.FeignClient.SunatClient;
import com.codigo.feign.Repository.EmpresaRepository;
import com.codigo.feign.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;
    private final SunatClient sunatClient;



    @Value("${token.api}")
    public String tokenApi;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository, SunatClient sunatClient) {
        this.empresaRepository = empresaRepository;
        this.sunatClient = sunatClient;
    }

    @Override
    public BaseResponse crearEmpresa(EmpresaRequest empresaRequest) {

        return null;
    }

    @Override
    public BaseResponse getInfoSunat(String ruc) {

        EmpresaResponse response = getExcution(ruc);
        if(response != null)
        {
            return new BaseResponse(Constants.CODE_SUCCESS, Constants.MESS_SUCCESS, Optional.of(response));
        }
        else
        {
            return new BaseResponse(Constants.CODE_ERROR, Constants.MESS_ERROR, Optional.empty());
        }

    }



    private EmpresaResponse getExcution(String numero){

        String authorization = "Bearer "+tokenApi;

        return sunatClient.getInfo(numero,authorization);


    }
}
