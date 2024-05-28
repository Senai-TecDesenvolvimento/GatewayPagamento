package com.tdesi.senai.pagamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/cartaopagamento")
public class CartaoController {
		
	@RequestMapping(method = RequestMethod.GET, value="cartao")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("OK");
    }
	
	
}
