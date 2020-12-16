package com.model;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		Tax icms = new ICMS();
		Tax iss = new ISS();
		
		Budget budget = new Budget(500.0);
		
		TaxCalculator calculator = new TaxCalculator();
		calculator.makeCalculation(budget, icms);
		calculator.makeCalculation(budget, iss);
	}
}
