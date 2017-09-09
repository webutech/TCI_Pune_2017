import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("Pankaj");
		set.add("Bhopal");
		set.add("Indore");
		System.out.println(set);
		
		System.out.println("Using For Each.....");
		for (Object element : set) {
			System.out.println(element);
		}
		
		System.out.println("using Iterator.........");
		Iterator it=set.iterator();
		while(it.hasNext()){
			Object element=it.next();
			System.out.println(element);
		}
		
		

	}

}
