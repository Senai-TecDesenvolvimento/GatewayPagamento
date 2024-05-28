package com.tdesi.senai.pagamento.controller;

import com.tdesi.senai.pagamento.entity.Boleto;
import com.tdesi.senai.pagamento.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value = "/boleto")
public class BoletoController {

    @Autowired
    private BoletoService boletoService;

	@RequestMapping(method = RequestMethod.GET, value="teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("OK");
        }
    @GetMapping("/cadastrar")
    public ResponseEntity<Boleto> cadastrarBoleto(
            @RequestParam Long numero,
            @RequestParam String nome,
            @RequestParam String vencimento,
            @RequestParam Long multa,
            @RequestParam Long juros) {

        Boleto boleto = new Boleto();
        boleto.setNumero(numero);
        boleto.setNome(nome);
        boleto.setVencimento(vencimento);
        boleto.setMulta(multa);
        boleto.setJuros(juros);

        Boleto boletoCadastrado = boletoService.cadastrarBoleto(boleto);
        return ResponseEntity.ok(boletoCadastrado);
    }
    }
