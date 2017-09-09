
public abstract class Car {
	
	public Car(){
		fillTank();
		drive();
		stop();
	}
	public abstract void drive();
	public abstract void stop();
	public void fillTank(){
		System.out.println("Fuling car tank.....");
	}
	

}
