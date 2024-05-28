package com.tdesi.senai.pagamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boletos")
public class Boleto {
    
    // Criação da tabela
    @Id // define a variavel id como chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;
    private Long numero;
    private String dataVencimento;
    private Double multa;
    private Double juros;

    // Construtor pafrão (nescessario para entidades JPA)
    public Boleto(Long numero, String dataVencimento) {
        this.numero = numero;
        this.dataVencimento = dataVencimento;
    }

    // Construtor completo
    public Boleto(Long numero, String dataVencimento, Double multa, Double juros) {
        this.numero = numero;
        this.dataVencimento = dataVencimento;
        this.multa = multa;
        this.juros = juros;
    }

    // Getters and Setters

    public Long getId() { 
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() { 
        return this.numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getDataVencimento() { 
        return this.dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getMulta() { 
        return this.multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getJuros() { 
        return this.juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

}
