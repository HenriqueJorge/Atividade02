package com.atividade2.maquineta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Conversion {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int pointRmConv;
	
	private Double paperPoint;
	
	private Double glassPoint;
	
	private Double plasticPoint;

}
