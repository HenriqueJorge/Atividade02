package com.atividade2.maquineta.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Transaction {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String cardId;
	
	private Date ts;
	
	private String terminalId;
	
	private String materialType;
	
	private Double weight;
	
	private int point;
	
	@ManyToOne @JoinColumn(name = "cardId")
	private String cardCardId;
	
	@ManyToOne @JoinColumn(name = "id")
	private Terminal terminalId1;

}
