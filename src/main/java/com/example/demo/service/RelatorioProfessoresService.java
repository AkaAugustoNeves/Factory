package com.example.demo.service;

import com.example.demo.model.interfaces.Relatorio;

public class RelatorioProfessoresService implements Relatorio{

	@Override
	public String gerar() {
		return "RelatorioProfessoresService";
	}
	
}
