package com.tdesi.senai.pagamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamentocontroller")
public class PagamentoController {
	
	@RequestMapping(method = RequestMethod.GET, value="pagamento")
	public ResponseEntity<String> pagamento() {
		return ResponseEntity.ok("OK");
	}
}
