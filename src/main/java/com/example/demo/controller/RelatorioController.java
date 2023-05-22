package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.enuns.TipoRelatorio;
import com.example.demo.service.RelatorioService;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {
	
	@Autowired
	private RelatorioService relatorioService;

	@GetMapping
	public String gerar(@RequestParam(defaultValue = "ESTUDANTES_MATRICULADOS") TipoRelatorio tipoRelatorio) {
		return relatorioService.gerar(tipoRelatorio);
	}
	
}