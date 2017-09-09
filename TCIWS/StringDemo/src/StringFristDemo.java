
public class StringFristDemo {

	public static void main(String[] args) {		
		String str="Hello";
		
		System.out.println("Hash code before changes : "+str.hashCode());
		System.out.println(str);
		
		str=str+" Friend";
		System.out.println("Hash code after changes : "+str.hashCode());
		System.out.println(str);
		
		
		
	}
}
