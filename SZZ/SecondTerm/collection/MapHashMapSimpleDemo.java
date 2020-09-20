package collection;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapSimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,String> map=new HashMap<>();
	 map.put("CN", "中华人民共和国");	
	 map.put("US", "美利坚合众国");	
	 map.put("UK", "大不列颠及北爱尔兰联合王国");	
	 map.put("FR", "法兰西共和国");	
	 	
	 System.out.println(map.size());	
		
	 System.out.println(map.get("UK"));	
		
	 map.remove("FR");	
		
	 System.out.println("FR还存在吗？"+map.containsKey("FR"));	
	 System.out.println(map.keySet());
	 System.out.println(map.values());
	 System.out.println(map);
	}

}
