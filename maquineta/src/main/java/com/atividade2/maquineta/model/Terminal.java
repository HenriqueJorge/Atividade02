package com.atividade2.maquineta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Terminal {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String terminalId;
	
	private String terminalName;

}
