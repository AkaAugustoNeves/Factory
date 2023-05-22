package com.example.demo.factory;

import org.springframework.stereotype.Service;

import com.example.demo.model.enuns.TipoRelatorio;
import com.example.demo.model.interfaces.Relatorio;
import com.example.demo.service.RelatorioEstudantesMatriculadosService;
import com.example.demo.service.RelatorioProfessoresService;

@Service
public class RelatorioFactoryImpl implements RelatorioFactory{
	
	public Relatorio criar(TipoRelatorio tipoRelatorio) {
		if(tipoRelatorio.equals(TipoRelatorio.ESTUDANTES_MATRICULADOS)) {
			return new RelatorioEstudantesMatriculadosService();
		} else if(tipoRelatorio.equals(TipoRelatorio.PROFESSORES)) {
			return new RelatorioProfessoresService();
		}
		return null;		
	}
	
}
