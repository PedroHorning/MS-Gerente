package br.net.gerente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gerente")
public class Gerente {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private Integer id;

	 @Column(name = "nome")
	 private String name;
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "cpf")
	 private String cpf;
	 
	 @Column(name = "type")
	 private String type;
	 
	 @Column(name = "telefone")
	 private String cellphone;
	 
	 public Integer getId() {
	    return id;
	 }

	 public void setId(Integer id) {
	    this.id = id;
	 }

	 public String getName() {
	    return name;
	 }

	 public void setName(String name) {
	    this.name = name;
	 }

	 public String getEmail() {
	    return email;
	 }

	 public void setEmail(String email) {
	    this.email = email;
	 }

	 public String getCpf() {
	    return cpf;
	 }

	 public void setCpf(String cpf) {
	    this.cpf = cpf;
	 }
	 
	 public String getType() {
		    return type;
		 }

		 public void setType(String type) {
		    this.type = type;
		 }

	 public String getCellphone() {
	    return cellphone;
	 }

	 public void setCellphone(String cellphone) {
	    this.cellphone = cellphone;
	 }
}
