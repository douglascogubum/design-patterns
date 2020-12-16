package com.impostos;

import com.calc.Tax;
import com.model.Budget;

public class ICCC implements Tax{

	@Override
	public double calculator(Budget orcamento) {
		if(orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.05; 
		} else if (orcamento.getValor() >= 1000.0 && orcamento.getValor() <= 3000.0) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.08 + 30.0;
		}
	}

}
