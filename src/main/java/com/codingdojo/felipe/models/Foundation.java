package com.codingdojo.felipe.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="foundations")
public class Foundation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="El nombre de la fundacion es obligatorio")
	private String firstName;
	
	@NotNull(message="El numero de Telefono es obligatorio")

	private int phoneNumber;
	
	@NotEmpty(message="La Contraseña es obligatorio")
	@Size(min=6, message="La Contraseña debe tener al menos 6 caracteres")
	private String password;
	
	@NotEmpty(message="El correo electrónico es obligatorio")
	@Email(message="Por favor introduzca una dirección de correo electrónico válida")
	private String email;
	
	@Transient 
	@NotEmpty(message="Confirmacion de Contraseña es obligatorio")
	@Size(min=6, message="La Confirmacion de Contraseña debe tener al menos 6 caracteres")
	private String confirm;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@OneToOne(mappedBy="foundation", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Direction direction;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Pet> petList;

	public Foundation() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	
	
}
