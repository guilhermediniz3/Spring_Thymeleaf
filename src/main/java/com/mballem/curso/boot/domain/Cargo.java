package com.mballem.curso.boot.domain;

import javax.persistence.*;

@Entity
@Table(name="Cargos")
public class Cargo extends AbstractEntity<Long> {
     @Column(name ="nome", nullable = false, unique = true , length = 60 )
	private String nome;
     @ManyToOne
     @JoinColumn(name= "id_departamento_fk")
     private Departamento departamento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
