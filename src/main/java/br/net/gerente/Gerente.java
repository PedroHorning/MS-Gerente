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
	 private String nome;
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "cpf")
	 private String cpf;
	 
	 @Column(name = "telefone")
	 private String telefone;
	 
	 public Integer getId() {
	    return id;
	 }

	 public void setId(Integer id) {
	    this.id = id;
	 }

	 public String getNome() {
	    return nome;
	 }

	 public void setNome(String nome) {
	    this.nome = nome;
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

	 public String getTelefone() {
	    return telefone;
	 }

	 public void setTelefone(String telefone) {
	    this.telefone = telefone;
	 }
}
