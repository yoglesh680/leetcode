package practice;

public class Employee {
	private String name;
	private int salary;

	public Employee() {
		super();
	}
	
	

	public Employee(String name) {
		super();
		this.name = name;
	}



	public Employee(String name, int string) {
		this.name = name;
		this.salary = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
