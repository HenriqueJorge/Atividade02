package com.atividade2.maquineta.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int userId;
	
	private String userName;
	
	private String password;
	
	private Date regDate;
	
	private String address1;
	
	private String address2;
	
	private String postcode;
	
	private String town;
	
	private String stage;
	
	private String lang;
	
	@OneToOne
	@JoinColumn(name = "id")
	private MasterBalance masterBalanceId;
	
	@OneToOne
	@JoinColumn(name = "cardId")
	private Card cardCardId;

}
