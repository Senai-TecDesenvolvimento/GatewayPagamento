package com.tdesi.senai.pagamento.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Entity(name = "pagamentos") // Define a classe como uma entidade JPA, mapeada para uma tabela no banco de dados.
public class Pagamento {

    @Id // Define o atributo 'id' como chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o valor do ID automaticamente pelo banco de dados.
    private Long id;
    private String status; // Armazena o status do pagamento (ex: APROVADO, RECUSADO).
    private BigDecimal valor; // Armazena o valor do pagamento.

    // Construtor padrão (essencial para JPA)
    public Pagamento() {}

    // Construtor para criar um novo pagamento com status e valor.
    public Pagamento(String status, BigDecimal valor) {
        this.status = status;
        this.valor = valor;
    }

    // Getters e Setters (permitem acessar e modificar os atributos da classe)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}