
public class MutableDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("Hash code before changes  : "+sb.hashCode());
		System.out.println(sb);
		
		sb.append(" Friend");
		System.out.println("Hash code after changes  : "+sb.hashCode());
		System.out.println(sb);
		

	}

}
