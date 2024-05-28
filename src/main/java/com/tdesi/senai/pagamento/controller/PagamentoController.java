package com.tdesi.senai.pagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdesi.senai.pagamento.entity.Pagamento;
import com.tdesi.senai.pagamento.service.PagamentoService;


@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoController {
	
	@Autowired
	private PagamentoService service;
		
	@RequestMapping(method = RequestMethod.GET, value="teste")
    public ResponseEntity<String> pagamento() {
        return ResponseEntity.ok("OK");
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity insert (@RequestBody Pagamento pagamento) {
        return ResponseEntity.ok(service.insert(pagamento));
    }
	
}
