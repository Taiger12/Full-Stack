package com.codigo.feign.FeignClient;


import com.codigo.feign.Aggregates.Response.ReniecResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "reniec-client", url = "https://api.apis.net.pe/v2/reniec/")

public interface ReniecClient {

        @GetMapping("/dni")
        ReniecResponse getInfo(@RequestParam("numero") String numero,
                               @RequestHeader("Authorization") String token);

        // apis-token-7310.EiGAneQ7KcHOUMn7Uof1E8Kd88KzEVCl
}
