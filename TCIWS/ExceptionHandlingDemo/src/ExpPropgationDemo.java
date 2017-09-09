
public class ExpPropgationDemo {

	
	public static void main(String[] args) {
		System.out.println("-------main :  First Line--------");
		method1();
		System.out.println("-------main :  Last Line--------");

	}

	private static void method1() {
		System.out.println("-------method1 :  First Line--------");
		try{
		method2();
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("-------method1 :  Last Line--------");
		
	}

	private static void method2() {
		System.out.println("-------method2 :  First Line--------");
//		int a=10/0;
//		System.out.println("a = "+a);
		method2();
		System.out.println("-------method2 :  Last Line--------");
	}

}
