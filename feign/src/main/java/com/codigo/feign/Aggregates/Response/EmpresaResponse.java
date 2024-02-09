package com.codigo.feign.Aggregates.Response;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaResponse {

    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private String estado;
    private String condicion;
    private String direccion;
    private String ubigeo;
    private String viaTipo;
    private String viaNombre;
    private String zonaCodigo;
    private String zonaTipo;
    private String numero;
    private String interior;
    private String lote;
    private String dpto;
    private String manzana;
    private String kilometro;
    private String distrito;
    private String provincia;
    private String departamento;
    private String EsAgenteRetencion;



}
/*
    "razonSocial": "BANTOTAL-CENTRO DE DESARROLLO S.A.C.",
    "tipoDocumento": "6",
    "numeroDocumento": "20553947414",
    "estado": "ACTIVO",
    "condicion": "HABIDO",
    "direccion": "AV. LAS CAMELIAS NRO 790 INT. 607 URB. SANTA CRUZ ",
    "ubigeo": "150131",
    "viaTipo": "AV.",
    "viaNombre": "LAS CAMELIAS",
    "zonaCodigo": "URB.",
    "zonaTipo": "SANTA CRUZ",
    "numero": "790",
    "interior": "607",
    "lote": "-",
    "dpto": "-",
    "manzana": "-",
    "kilometro": "-",
    "distrito": "SAN ISIDRO",
    "provincia": "LIMA",
    "departamento": "LIMA",
    "EsAgenteRetencion": false


 */
