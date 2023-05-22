package com.example.demo.model.enuns;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TipoRelatorio {
	
	ESTUDANTES_MATRICULADOS,
	PROFESSORES;
	
	private Long id;
	private String nome;
	
	public static List<TipoRelatorio> valores(){
		return Arrays.asList(values());
	}
	
}