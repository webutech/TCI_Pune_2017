
public class StringOperations {

	public static void main(String[] args) {
		String str="WeLcome iN Yash";
		System.out.println("charAt : "+str.charAt(0));
		System.out.println("contain "+str.contains("in"));
		System.out.println("indexOf "+str.indexOf('e'));
		System.out.println("lastIndexOf "+str.lastIndexOf('e'));
		System.out.println("length "+str.length());
		System.out.println("replace "+str.replace("in", "that"));
		System.out.println("upper case "+str.toUpperCase());
		System.out.println("lower case "+str.toLowerCase());
	}

}
