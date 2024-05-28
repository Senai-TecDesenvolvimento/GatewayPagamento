package com.tdesi.senai.pagamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdesi.senai.pagamento.entity.Pagamento;
import com.tdesi.senai.pagamento.repository.PagamentoRepository;

@Service
public class PagamentoService {
    // Implementação dos métodos de serviço
	@Autowired
	private PagamentoRepository repository;
	
	public String pagamento() {
		return "OK";
	}
	
	public Pagamento insert(Pagamento pagamento) {
		Pagamento t = repository.save(pagamento);
		return t;
	}
	
	public List<Pagamento> findAll(){
		return repository.findAll();
	}
	
	public Pagamento findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
