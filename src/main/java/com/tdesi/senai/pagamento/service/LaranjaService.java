package com.tdesi.senai.pagamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdesi.senai.pagamento.entity.Laranja;
import com.tdesi.senai.pagamento.repository.LaranjaRepository;

@Service
public class LaranjaService {
	
	@Autowired
	private LaranjaRepository repository;
	
	public Laranja saveLaranja(Laranja laranja) {
		return repository.save(laranja);
	}

}
