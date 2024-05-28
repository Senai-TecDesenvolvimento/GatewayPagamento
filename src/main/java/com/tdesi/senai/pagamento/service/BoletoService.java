package com.tdesi.senai.pagamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tdesi.senai.pagamento.entity.Boleto;
import com.tdesi.senai.pagamento.repository.BoletoRepository;

import java.util.Optional;

@Service
public class BoletoService {

    @Autowired
    private BoletoRepository repository;

    public Boleto findById(Long id) {
        Optional<Boleto> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Boleto not found!"));
    }

    public Boleto update(Long id, Boleto boleto) {
        Boleto existingBoleto = findById(id);
        existingBoleto.setDescription(boleto.getDescription());
        existingBoleto.setAmount(boleto.getAmount());
        return repository.save(existingBoleto);
    }

    public Boleto insert(Boleto boleto) {
        return repository.save(boleto);
    }
}