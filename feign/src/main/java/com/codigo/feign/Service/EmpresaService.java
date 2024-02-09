package com.codigo.feign.Service;

import com.codigo.feign.Aggregates.Request.EmpresaRequest;
import com.codigo.feign.Aggregates.Response.BaseResponse;

public interface EmpresaService {
    BaseResponse crearEmpresa(EmpresaRequest empresaRequest);
    BaseResponse getInfoSunat(String ruc);

}
