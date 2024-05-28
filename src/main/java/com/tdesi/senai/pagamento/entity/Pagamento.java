package com.tdesi.senai.pagamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "pagamento")

public class Pagamento {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "cartao")
	@OneToOne
	private Cartao cartao;
	
	@Column(name = "boleto")
	@ManyToOne
	private Boleto boleto;*/
	
	public Pagamento(String status, Boleto boleto, Cartao cartao) {
		this.status = status;
		this.boleto = boleto;
		this.cartao = cartao;
	}
	
	//Getters e Setters
	
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
	
	public Cartao getCartao() {
		return cartao;
	}
	
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public Boleto getBoleto() {
		return boleto;
	}
	
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
}
