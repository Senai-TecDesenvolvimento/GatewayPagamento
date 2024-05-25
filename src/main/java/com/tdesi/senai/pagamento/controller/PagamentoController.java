package com.tdesi.senai.pagamento.controller;

import com.tdesi.senai.pagamento.entity.Pagamento;
import com.tdesi.senai.pagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Define a classe como um controlador REST que lida com requisições HTTP.
@RequestMapping("/api/pagamentos") // Define o endpoint base da API para "/api/pagamentos".
public class PagamentoController {

    @Autowired // Injeta o serviço PagamentoService para lidar com a lógica de negócio.
    private PagamentoService pagamentoService;

    @PostMapping // Mapeia requisições HTTP POST para o endpoint "/api/pagamentos" para criar um novo pagamento.
    public ResponseEntity<Pagamento> criarPagamento(@RequestBody Pagamento pagamento) {
        Pagamento novoPagamento = pagamentoService.criarPagamento(pagamento); // Chama o serviço para criar o pagamento.
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPagamento); // Retorna o novo pagamento criado com status 201 (Created).
    }

    @GetMapping("/{id}") // Mapeia requisições HTTP GET para o endpoint "/api/pagamentos/{id}" para buscar um pagamento por ID.
    public ResponseEntity<?> buscarPagamentoPorId(@PathVariable Long id) { // Extrai o ID do caminho da requisição.
        Pagamento pagamento = pagamentoService.buscarPagamentoPorId(id); // Busca o pagamento pelo ID utilizando o serviço.

        if (pagamento != null) {
            return ResponseEntity.ok(pagamento); // Retorna o pagamento encontrado com status 200 (OK).
        } else {
            return ResponseEntity.notFound().build(); // Retorna status 404 (Not Found) se o pagamento não for encontrado.
        }
    }
}