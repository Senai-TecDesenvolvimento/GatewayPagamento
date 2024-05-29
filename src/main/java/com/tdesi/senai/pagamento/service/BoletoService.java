package com.tdesi.senai.pagamento.service;

import com.tdesi.senai.pagamento.entity.Boleto;
import com.tdesi.senai.pagamento.repository.BoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletoService {

    @Autowired
    private BoletoRepository boletoRepository;

    public Boleto cadastrarBoleto(Boleto boleto) {
        return boletoRepository.save(boleto);
    }

    public List<Boleto> findAll() {
        return boletoRepository.findAll();
    }
}