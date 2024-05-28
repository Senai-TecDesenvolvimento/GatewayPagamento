package com.tdesi.senai.pagamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdesi.senai.pagamento.entity.Teste;
import com.tdesi.senai.pagamento.service.TesteService;

@RestController
@RequestMapping(value = "/testes")
public class TesteController {
	
	@Autowired
	private TesteService service;
	
	@RequestMapping(method = RequestMethod.GET, value="teste")
    public ResponseEntity<String> teste() {
		String result = service.teste();
        return ResponseEntity.ok(result);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity insert (@RequestBody Teste teste) {
        return ResponseEntity.ok(service.insert(teste));
    }
	
	
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Teste>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity edit(@RequestBody Teste teste, @PathVariable Long id){
    	return ResponseEntity.ok(service.insert(teste));
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
    	service.deleteById(id);
    	return ResponseEntity.ok().build();
    }
	
}
