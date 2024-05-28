package com.tdesi.senai.pagamento.repository;

import com.tdesi.senai.pagamento.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoRepository extends JpaRepository<Boleto, Long> {
    // Consulta personalizada (se necessário)
    // @Query(value = "select b from Boleto b where b.id = ?1")
    // Boleto findBoletoById(Long id);
}