package com.example.demo.service;

import com.example.demo.model.interfaces.Relatorio;

import lombok.Getter;

@Getter
public class RelatorioEstudantesMatriculadosService implements Relatorio {
	
	@Override
	public String gerar() {
		return "RelatorioEstudantesMatriculadosService";
	}
	
}
