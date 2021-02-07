package com.mballem.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	@Column(name ="nome",nullable = false, unique =  true, length = 60 	)
 private String nome;
 public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

private List<Cargo> cargos;
 @OneToMany(mappedBy ="departamento")
 public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
 
}
