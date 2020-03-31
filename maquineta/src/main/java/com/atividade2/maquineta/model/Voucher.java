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
public class Voucher {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String longId;
	
	private String voucherNo;
	
	private String userId;
	
	private Double anount;
	
	private Date ts;
	
	private int status;
	
	private Date expiryDate;
	
	private String pdf;
	
	private String consumeDetails;
	
	@ManyToOne @JoinColumn(name = "id")
	private User userId1;
	

}
