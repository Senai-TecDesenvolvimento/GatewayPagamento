package com.tdesi.senai.pagamento.service;


import com.tdesi.senai.pagamento.entity.Pagamento;
import com.tdesi.senai.pagamento.repository.PagamentoRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Indica que a classe é um componente Spring que contém lógica de negócio.
public class PagamentoService {

    @Autowired // Injeta o repositório PagamentoRepository para acessar o banco de dados.
    private PagamentoRepository  pagamentoRepository;

    // Método para criar um novo pagamento no banco de dados.
    public Pagamento criarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento); // Salva o novo pagamento no banco de dados.
    }

    // Método para buscar um pagamento pelo ID no banco de dados.
    public Pagamento buscarPagamentoPorId(Long id) {
        return pagamentoRepository.findById(id).orElse(null); // Busca o pagamento pelo ID e retorna null se não encontrado.
    }
}