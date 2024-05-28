package com.tdesi.senai.pagamento.repository;

import com.tdesi.senai.pagamento.entity.Boleto;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoletoRepository extends JpaRepository<Boleto, Long> {
	Optional<Boleto> findById(Long id);
}
