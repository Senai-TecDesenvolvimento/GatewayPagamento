package com.tdesi.senai.pagamento.repository;

import com.tdesi.senai.pagamento.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoletoRepository extends JpaRepository<Boleto, Long> {

    @Query(value = "select id from boleto")
    public Boleto getBoleto(Long id);
}
