package com.codigo.feign.Controller;

import com.codigo.feign.Aggregates.Response.BaseResponse;
import com.codigo.feign.Service.PersonaService;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persona")
public class PersonaController {

    private final PersonaService personaService;


    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/{numero}")
    public BaseResponse getInfoReniec(@PathVariable String numero)
    {
        return personaService.getInfoReniec(numero);
    }



}
