package netwagecalculator.domain.model;

public class Employee {
	
	private Long id;
	private String name;
	private Double grossWage;
	
	public Employee() {
		
	}

	public Employee(Long id, String name, Double grossWage) {
		this.id = id;
		this.name = name;
		this.grossWage = grossWage;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossWage() {
		return grossWage;
	}

	public void setGrossWage(Double grossWage) {
		this.grossWage = grossWage;
	}
	
}
