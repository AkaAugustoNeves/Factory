package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.factory.RelatorioFactory;
import com.example.demo.model.enuns.TipoRelatorio;

@Service
public class RelatorioService {
	
	@Autowired
	private RelatorioFactory relatorioFactory;

	public String gerar(TipoRelatorio tipoRelatorio) {
		return relatorioFactory.criar(tipoRelatorio).gerar();
	}

}