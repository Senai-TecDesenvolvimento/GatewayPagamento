package com.tdesi.senai.pagamento.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "CartaoGateway") // Define a classe como uma entidade JPA, mapeada para uma tabela no banco de dados.
public class Pagamento {

    @Id // Define o atributo 'id' como chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o validade do ID automaticamente pelo banco de dados.
    private Long id;
    private Long numero;
    private String nome; // Armazena o nome do Pagamento (ex: APROVADO, RECUSADO).
    private String validade; // Armazena o validade do Pagamento.

    // Construtor padrão (essencial para JPA)
    public Pagamento(Long numero) {
        this.numero = numero;
    }

    // Construtor para criar um novo Pagamento com nome e validade.
    public Pagamento(Long numero, String nome, String validade) {
        this.numero = numero;
        this.nome = nome;
        this.validade = validade;
    }

    // Getters e Setters (permitem acessar e modificar os atributos da classe)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long id) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}