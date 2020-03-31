package com.atividade2.maquineta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Admin {
	
	@Id
	private String adminId;
	
	private String password;

}
