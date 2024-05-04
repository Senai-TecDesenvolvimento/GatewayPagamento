package com.tdesi.senai.pagamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdesi.senai.pagamento.entity.Teste;
import com.tdesi.senai.pagamento.repository.TesteRepository;

@Service
public class TesteService {
	
	@Autowired
	private TesteRepository repository;
	
	public String teste() {
		return "OK";
	}
	
	public Teste insert(Teste teste) {
		Teste t = repository.save(teste);
		return t;
	}
	
	public List<Teste> findAll(){
		return repository.findAll();
	}
	
	public Teste findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
