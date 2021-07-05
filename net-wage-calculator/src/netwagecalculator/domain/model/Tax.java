package netwagecalculator.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Tax {
	
	INSS(Arrays.asList(1100.0, 2203.48, 3305.22, 6433.57), Arrays.asList(0.075, 0.09, 0.12, 0.14)),
	IRRF(Arrays.asList(1903.98, 2826.65, 3751.05, 4664.68), Arrays.asList(0.075, 0.15, 0.225, 0.275));
	
	private List<Double> range, taxRate = new ArrayList<Double>();
	
	Tax(List<Double> range, List<Double> taxRate) {
		this.range = range;
		this.taxRate = taxRate;
	}

	public List<Double> getRange() {
		return range;
	}

	public List<Double> getTaxRate() {
		return taxRate;
	}

	
}
