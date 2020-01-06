package com.microservice.counthvip.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.NotEmpty;


@Document(collection="clientpersonn")
public class ClientPerson {
	
	@Id
	@NotEmpty
	private String Id;
	
	private String name;
	
	private String lastname;
	
	private String dni;
	
	private String type;
	
	public ClientPerson() {
		
	}

	public ClientPerson(String name) {
		
		this.name = name;
	}
		

	public ClientPerson(String name, String lastname, String dni) {
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
	}



	public String getId() {
		return Id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
