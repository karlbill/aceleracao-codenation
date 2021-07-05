package netwagecalculator.domain.repository;

public interface Calculator{
	
	public Double calculateNetWage(Double wage);
	public Double calculateINSSDeduction(Double wage);
	public Double calculateIRRFDeduction(Double baseWage);

}
