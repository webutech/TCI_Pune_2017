class Employee{
	private String name;
	private String address;
	
	public Employee(){
		this("Unknown");
	}
	
	public Employee(String name){
		this.name=name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void showDetail(){
		System.out.println("Employee name : "+getName());
	}
}
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.showDetail();

	}

}
