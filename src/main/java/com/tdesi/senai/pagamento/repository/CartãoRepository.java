package com.tdesi.senai.pagamento.repository;

import com.tdesi.senai.pagamento.entity.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartãoRepository extends JpaRepository<Cartao, Long> {

}
