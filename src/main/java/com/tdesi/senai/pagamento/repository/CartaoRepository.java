package com.tdesi.senai.pagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdesi.senai.pagamento.entity.Pagamento;

public interface CartaoRepository extends JpaRepository <Pagamento, Long> {

}
