package com.example.demo.factory;

import com.example.demo.model.enuns.TipoRelatorio;
import com.example.demo.model.interfaces.Relatorio;

public interface RelatorioFactory {

	public Relatorio criar(TipoRelatorio tipoRelatorio);
	
}
