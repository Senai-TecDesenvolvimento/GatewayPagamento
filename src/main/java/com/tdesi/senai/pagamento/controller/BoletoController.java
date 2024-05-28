package com.tdesi.senai.pagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tdesi.senai.pagamento.entity.Boleto;
import com.tdesi.senai.pagamento.service.BoletoService;

@RestController
@RequestMapping(value = "/boleto")
public class BoletoController {

    @Autowired
    private BoletoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Boleto> findById(@PathVariable Long id) {
        Boleto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boleto> update(@RequestBody Boleto boleto, @PathVariable Long id) {
        Boleto updatedBoleto = service.update(id, boleto);
        return ResponseEntity.ok().body(updatedBoleto);
    }

    @PostMapping
    public ResponseEntity<Boleto> insert(@RequestBody Boleto boleto) {
        Boleto newBoleto = service.insert(boleto);
        return ResponseEntity.ok().body(newBoleto);
    }
}