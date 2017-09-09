
public class Employee {
	
	private String name;

	public String getName() {
		return name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
