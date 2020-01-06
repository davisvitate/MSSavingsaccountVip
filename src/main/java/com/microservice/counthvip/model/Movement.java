package com.microservice.counthvip.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "movement")
public class Movement {

	@Id
	private String id;
	
	@NotNull
	private String type_account;
	
	@NotNull
	private String num_count;

	@NotNull
	private double saldo;
	
	@NotNull
	private int num_mov;
	
	@NotNull
	private double commission;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	@NotNull
	private String description;

	public String getType_account() {
		return type_account;
	}

	public void setType_account(String type_account) {
		this.type_account = type_account;
	}

	@NotNull
	private ClientPerson client;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDate() {
		return date;
	}
	

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClientPerson getClient() {
		return client;
	}

	public void setClient(ClientPerson client) {
		this.client = client;
	}

	public String getNum_count() {
		return num_count;
	}

	public void setNum_count(String num_count) {
		this.num_count = num_count;
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
