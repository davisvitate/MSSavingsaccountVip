package com.microservice.counthvip.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Document(collection = "counthvip")
public class CountHvip {

	@Id
	private String id;

	private String num;

	private Double monto;
	
	private String bank;
	
	private String codBank;
	
	private int num_mov= 0;
	
	private double commission=0;

	@Valid
	@NotNull
	private ClientPerson clientperson;

	private List<Titular> titulares;

	private List<Firmante> firmante;

	public CountHvip() {
	}

	public CountHvip(String num, Double monto) {
		this.num = num;
		this.monto = monto;
	}

	public CountHvip(String num, Double monto, ClientPerson clientperson) {
		this(num, monto);
		this.clientperson = clientperson;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public ClientPerson getClientperson() {
		return clientperson;
	}

	public void setClientperson(ClientPerson clientperson) {
		this.clientperson = clientperson;
	}

	public List<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}

	public List<Firmante> getFirmante() {
		return firmante;
	}

	public void setFirmante(List<Firmante> firmante) {
		this.firmante = firmante;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCodBank() {
		return codBank;
	}

	public void setCodBank(String codBank) {
		this.codBank = codBank;
	}

	public int getNum_mov() {
		return num_mov;
	}

	public void setNum_mov(int num_mov) {
		this.num_mov = num_mov;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	

	
}
