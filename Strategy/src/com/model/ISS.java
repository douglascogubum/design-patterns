package com.model;

public class ISS implements Tax {

	@Override
	public double calculator(Budget orcamento) {
		return orcamento.getValor() * 0.06;
	}	
}
