package com.atividade2.maquineta.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Card {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String cardId;
	
	private int status;
	
	private Date expiryDate;
	
	private String hardId;
}
