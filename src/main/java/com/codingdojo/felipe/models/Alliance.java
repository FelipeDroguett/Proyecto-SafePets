package com.codingdojo.felipe.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="alliances")
public class Alliance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="El nombre de su local es obligatorio")
	private String firstName;
	
	@NotEmpty(message="El correo electrónico es obligatorio")
	@Email(message="Por favor introduzca una dirección de correo electrónico válida")
	private String email;
	
	@NotEmpty(message="La licencia Municipal es obligatorio")
	private String municipalLicense;
	
	@NotNull(message="El numero de Telefono es obligatorio")
	private int phoneNumber;
	
	@NotEmpty(message="La Contraseña es obligatorio")
	@Size(min=6, message="La Contraseña debe tener al menos 6 caracteres")
	private String password;
	
	@Transient 
	@NotEmpty(message="Confirmacion de Contraseña es obligatorio")
	@Size(min=6, message="La Confirmacion de Contraseña debe tener al menos 6 caracteres")
	private String confirm;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@OneToOne(mappedBy="alliance", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Direction direction;

	public Alliance() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	

	public String getMunicipalLicense() {
		return municipalLicense;
	}

	public void setMunicipalLicense(String municipalLicense) {
		this.municipalLicense = municipalLicense;
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

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	
}
