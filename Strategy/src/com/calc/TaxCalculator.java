package com.calc;

import com.model.Budget;

public class TaxCalculator {
	
	public void makeCalculation(Budget orcamento, Tax anyTax) {
		
		double tax = anyTax.calculator(orcamento);
		System.out.println(tax);
	}
}
