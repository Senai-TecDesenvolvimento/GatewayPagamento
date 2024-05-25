package com.tdesi.senai.pagamento.repository;

import com.tdesi.senai.pagamento.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que a interface é um repositório Spring Data.
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    // Métodos para acessar os dados de pagamento no banco de dados são fornecidos pelo JpaRepository.
}