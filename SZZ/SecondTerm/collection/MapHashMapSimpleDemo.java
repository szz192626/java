package collection;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapSimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,String> map=new HashMap<>();
	 map.put("CN", "�л����񹲺͹�");	
	 map.put("US", "��������ڹ�");	
	 map.put("UK", "���е߼�����������������");	
	 map.put("FR", "���������͹�");	
	 	
	 System.out.println(map.size());	
		
	 System.out.println(map.get("UK"));	
		
	 map.remove("FR");	
		
	 System.out.println("FR��������"+map.containsKey("FR"));	
	 System.out.println(map.keySet());
	 System.out.println(map.values());
	 System.out.println(map);
	}

}
