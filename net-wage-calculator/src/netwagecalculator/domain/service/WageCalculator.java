package netwagecalculator.domain.service;

import java.util.ArrayList;

import netwagecalculator.domain.model.Tax;
import netwagecalculator.domain.repository.Calculator;

public class WageCalculator implements Calculator{
	
	@Override
	public Double calculateNetWage(Double wage) {
		double inssDeduction = calculateINSSDeduction(wage);
		double irrfDeduction = calculateIRRFDeduction(wage);
		double tributes = inssDeduction + irrfDeduction;
		double netWage = wage - tributes;
		
		return netWage;
	}

	@Override
	public Double calculateINSSDeduction(Double wage) {
		int wageRange = calculateWageRange(wage, new ArrayList<Double>(Tax.INSS.getRange()));
		double inssDeduction = calculateWageDeduction(wage, wageRange, Tax.INSS);
		
		return inssDeduction;
	}

	@Override
	public Double calculateIRRFDeduction(Double wage) {
		int wageRange = calculateWageRange(wage, new ArrayList<Double>(Tax.IRRF.getRange()));
		double baseWage = wage - calculateINSSDeduction(wage);
		double irrfDeduction = calculateWageDeduction(baseWage, wageRange, Tax.IRRF);
		
		return irrfDeduction;
	}
	
	
	public int calculateWageRange(Double wage, ArrayList<Double> wageRange) {
		/*When the wage is bigger than the maximum wageRange, then never satisfy the condition.
		  Because of that the calculatedWageRange is initialized with 3.*/
		int calculatedWageRange = 3;
		
		for (Double range : wageRange) {
			if(wage.compareTo(range) < 0){ 
				calculatedWageRange = wageRange.indexOf(range); 
				break;
			}
		}
		
		return calculatedWageRange;
	}

	public double calculateWageDeduction(Double wage, int wageRange, Tax tax) {
		double wageDdeduction = 0.0;
		
		for (int i = 0; i <= wageRange; i++) {
			wageDdeduction += calculateRangeDeduction(wage, i, tax);
		}
		
		return wageDdeduction;
	}
	
	public double calculateRangeDeduction(Double wage, int wageRange, Tax tax) {
		double rangeDeduction = 0.0;
		rangeDeduction = (wage.compareTo(tax.getRange().get(wageRange)) <= 0) 
							? rangeDeduction + (wage * tax.getTaxRate().get(wageRange))  
							: rangeDeduction + ((tax.getRange().get(wageRange) - tax.getRange().get(wageRange - 1)) 
									* tax.getTaxRate().get(wageRange));
		
		return Math.round(rangeDeduction);
	}
}
