package com.impostos;

import com.calc.Tax;
import com.model.Budget;

public class ICMS implements Tax {

	@Override
	public double calculator(Budget orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
