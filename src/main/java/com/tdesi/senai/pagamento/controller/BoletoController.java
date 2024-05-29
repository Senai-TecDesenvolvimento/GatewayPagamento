package com.tdesi.senai.pagamento.controller;

import com.tdesi.senai.pagamento.entity.Boleto;
import com.tdesi.senai.pagamento.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@RequestMapping(value = "/boleto")
public class BoletoController {

    @Autowired
    private BoletoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Boleto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("OK");
    }


}