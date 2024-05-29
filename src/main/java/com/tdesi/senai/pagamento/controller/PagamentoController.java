package com.tdesi.senai.pagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	 @RequestMapping(method = RequestMethod.GET, value = "/{id}")
	 public ResponseEntity findById(@PathVariable Long id){
	    return ResponseEntity.ok().body(service.findById(id));
	 }

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity edit(@RequestBody Pagamento pagamento, @PathVariable Long id){
		return ResponseEntity.ok(service.insert(pagamento));
	}
}
