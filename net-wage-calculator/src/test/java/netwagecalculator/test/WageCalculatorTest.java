package netwagecalculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import netwagecalculator.domain.model.Tax;
import netwagecalculator.domain.service.WageCalculator;

public class WageCalculatorTest {
	
	WageCalculator calculator = new WageCalculator();
	
	@Test
	void whenWageIs500_thenRangeIsInTheFirstLevel() {
		assertEquals(0, calculator.calculateWageRange(500.00,
				new ArrayList<Double>(Arrays.asList(1100.0, 2203.48, 3305.22, 6433.57))));
	}
	
	@Test
	void whenWageIs7000_thenRangeIsInTheFourthLevel() {
		assertEquals(3, calculator.calculateWageRange(7000.00,
				new ArrayList<Double>(Arrays.asList(1100.0, 2203.48, 3305.22, 6433.57))));
	}

	@Test
	void whenWageIs500AndIsINSSTax_thenRangeDeductionIsTheMinimum() {
		assertEquals(38.0, calculator.calculateRangeDeduction(500.00, 0, Tax.INSS));
	}

	@Test
	void whenWageIs1100AndIsINSSTax_thenRangeDeductionIsTheMinimum() {
		assertEquals(83.0, calculator.calculateRangeDeduction(1100.00, 0, Tax.INSS));
	}
	@Test
	void whenWageIs1200AndIsINSSTax_thenRangeDeductionIsInTheSecondLevel() {
		assertEquals(9.0, calculator.calculateRangeDeduction(1200.00, 1, Tax.INSS));
	}

}
