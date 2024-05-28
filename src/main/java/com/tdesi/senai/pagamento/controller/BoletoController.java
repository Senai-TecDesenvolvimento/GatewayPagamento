package com.tdesi.senai.pagamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/boleto")
public class BoletoController {
		
	@RequestMapping(method = RequestMethod.GET, value="teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("OK");
    }
	
	
}
