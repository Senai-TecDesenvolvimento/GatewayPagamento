package com.tdesi.senai.pagamento.controller;

import com.tdesi.senai.pagamento.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/boleto")
public class BoletoController {

    @Autowired
    private BoletoService service;
		
	@RequestMapping(method = RequestMethod.GET, value="teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("OK");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity insert (@RequestBody Boleto boleto) {
        return ResponseEntity.ok(service.insert(boleto));
    }
	
}
