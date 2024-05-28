package com.tdesi.senai.pagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    @RequestMapping(method = RequestMethod.GET, value = "pagamentos")
    public ResponseEntity<String> pagamentos() {
        String result = service.pagamento();
        return ResponseEntity.ok("ok");
    }
}

@Service
class PagamentoService {

    public String pagamento() {
        return "Pagamento realizado com sucesso!";
    }
}
