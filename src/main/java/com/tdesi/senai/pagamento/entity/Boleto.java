package com.tdesi.senai.pagamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boleto")  // Especifica a tabela correspondente, se necessário
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numero;
    private String nome;
    private String vencimento;
    private Long multa;
    private Long juros;

    public Boleto() {
    }

    public Boleto(Long id, Long numero, String nome, String vencimento, Long multa, Long juros) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.vencimento = vencimento;
        this.multa = multa;
        this.juros = juros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public Long getMulta() {
        return multa;
    }

    public void setMulta(Long multa) {
        this.multa = multa;
    }

    public Long getJuros() {
        return juros;
    }

    public void setJuros(Long juros) {
        this.juros = juros;
    }

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAmount(Object amount) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(Object description) {
		// TODO Auto-generated method stub
		
	}
}