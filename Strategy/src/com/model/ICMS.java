package com.model;

public class ICMS implements Tax {

	@Override
	public double calculator(Budget orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
