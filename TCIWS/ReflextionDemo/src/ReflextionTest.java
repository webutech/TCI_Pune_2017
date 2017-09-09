import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflextionTest {

	public static void main(String[] args) throws Exception{
		Class c=Class.forName("Employee");
		System.out.println(c);
		System.out.println("Super class : "+c.getSuperclass());
		Class[] classes=c.getInterfaces();
		for (Class className : classes) {
			System.out.println(className);
		}
		
		int i=c.getModifiers();
		System.out.println("Modifyer : "+Modifier.toString(i));
		
//		Employee employee=new Employee();
//		System.out.println(employee);
		
		Constructor[] constructors=c.getDeclaredConstructors();
		System.out.println("total constructors : "+constructors.length);
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		constructors[0].setAccessible(true);
		Employee employee=(Employee)constructors[0].newInstance();
		System.out.println(employee);

	}

}
