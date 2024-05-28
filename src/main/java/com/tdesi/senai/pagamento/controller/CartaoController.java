package com.tdesi.senai.pagamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdesi.senai.pagamento.entity.Cartao;
import com.tdesi.senai.pagamento.entity.Teste;
import com.tdesi.senai.pagamento.service.CartaoService;





@RestController
@RequestMapping(value = "/cartao")
public class CartaoController {
		
	@Autowired
	private CartaoService service;
	
	@RequestMapping(method = RequestMethod.GET, value="teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("OK");
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity insert (@RequestBody Cartao cartao) {
        return ResponseEntity.ok(service.insert(cartao));
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity finById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity edit(@RequestBody Cartao cartao, @PathVariable Long id){
    	return ResponseEntity.ok(service.insert(cartao));
    	}
}
