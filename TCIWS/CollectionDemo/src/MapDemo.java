import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("k1", "Value of K1");
		map.put("k2", "Value of K2");
		map.put("k3", "Value of K3");
		System.out.println(map);
		
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			Object key=it.next();
			System.out.println("Value of "+key+" is :"+map.get(key));
		}

	}

}
