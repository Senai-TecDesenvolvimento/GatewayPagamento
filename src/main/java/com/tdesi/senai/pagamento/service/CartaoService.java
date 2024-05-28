package com.tdesi.senai.pagamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdesi.senai.pagamento.entity.Cartao;
import com.tdesi.senai.pagamento.entity.Teste;
import com.tdesi.senai.pagamento.repository.CartãoRepository;


@Service
public class CartaoService {

	@Autowired
	private CartãoRepository repository;
	
	public String teste() {
		return "OK";
	}

	public Cartao insert(Cartao cartao) {
		Cartao t = repository.save(cartao);
		return t;
	}
	
	public Cartao findById(Long id) {
		return repository.findById(id).orElse(null);
	}
}
