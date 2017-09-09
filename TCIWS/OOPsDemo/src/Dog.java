
public class Dog {
	
	private String name;
	private int age;
	
	public void setAge(int age) {
		if(age<0){
			throw new RuntimeException("Age can not be negative");
		}
		else{
		this.age = age;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat(){
		System.out.println(name +" is eating "+age);
	}
	
	public void run(){
		System.out.println(name +" is running "+age);
	}

}
