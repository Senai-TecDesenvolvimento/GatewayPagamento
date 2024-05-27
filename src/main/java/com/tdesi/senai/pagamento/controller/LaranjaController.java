package com.tdesi.senai.pagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdesi.senai.pagamento.entity.Laranja;
import com.tdesi.senai.pagamento.entity.Teste;
import com.tdesi.senai.pagamento.service.LaranjaService;

@RestController
@RequestMapping(value = "/laranja")
public class LaranjaController {
	
	@Autowired
	private LaranjaService service;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> teste() {
		String result = "laranja retornando";
        return ResponseEntity.ok(result);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity insert (@RequestBody Laranja laranja) {
        return ResponseEntity.ok(service.saveLaranja(laranja));
    }

}
