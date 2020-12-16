package com.model;

import com.calc.Tax;
import com.calc.TaxCalculator;
import com.impostos.ICCC;
import com.impostos.ICMS;
import com.impostos.ISS;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		Tax icms = new ICMS();
		Tax iss = new ISS();
		Tax iccc = new ICCC();
		
		Budget budget = new Budget(4000.0);
		
		TaxCalculator calculator = new TaxCalculator();
		
		calculator.makeCalculation(budget, icms);
		calculator.makeCalculation(budget, iss);
		calculator.makeCalculation(budget, iccc);
	}
}
