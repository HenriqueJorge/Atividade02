package com.atividade2.maquineta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class MasterBalance {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne @JoinColumn(name = "userId")
	private User userId;
	
	private int pointBalance;

}
