
public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("--------Line First----------");
		int a=10;
		int b=0;
		try{
		int c=a/b;
		System.out.println("c "+c);
		}
		catch(Throwable ex){
			System.out.println("error : "+ex.getMessage());
		}
		System.out.println("--------Line Last-----------");

	}

}
