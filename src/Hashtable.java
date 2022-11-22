import java.util.HashMap;
import java.util.Map;

public class Hashtable {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(100,"Rajender");
		hm.put(102, "Praveen");
		hm.put(101,"Bipin");
		hm.put(103,"Pankaj");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}

	}

}
