package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMapCustomSeqDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Dog,String> map=new TreeMap<Dog,String>(new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			});
		map.put(new Dog("张三",4,"金毛"), "张阿黄");
		map.put(new Dog("李四",4,"拉布拉多"), "李四");
		map.put(new Dog("王二",5,"京巴"), "王京巴");
		System.out.println(map);
		System.out.println(map.size());
//		hashmap的key对象相等的原则同hashset
		map.put(new Dog("王二",6,"土狗"), "王京巴");
		
//		自带方法打印
//		System.out.println(map.size());
//		System.out.println(map);
		
//		第一种遍历，使用entry条目set来遍历，同时使用iterator
		Set<Map.Entry<Dog, String>>entries=map.entrySet();
		Iterator<Map.Entry<Dog, String>>iterator=entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Dog, String>entry=iterator.next();
			System.out.println("key=["+entry.getKey()+"],value["+entry.getValue()+"]");
		}
//		第二种
		System.out.println("-----------第二种遍历方法,是第一种的延伸-------------------");
		for(Map.Entry<Dog, String>entry:entries) {
			System.out.println("key=["+entry.getKey()+"],value["+entry.getValue()+"]");
		}
//		第三种
		System.out.println("-----------第三种遍历方法,使用keySet读取key，然后联合Map的get读取value-------------------");
		Set<Dog>dogset=map.keySet();
		for(Dog dog:dogset) {
			System.out.println("key=["+dog+"],value["+map.get(dog)+"]");
		}
//		第四种
		System.out.println("-----------第四种遍历方法,使用iterator遍历读取key，然后联合Map的get读取value-------------------");
		Iterator<Dog>iterator2=dogset.iterator();
		while(iterator2.hasNext()) {
			Dog dog2=iterator2.next();
			System.out.println("key=["+dog2+"],value["+map.get(dog2)+"]");
		}
		
	}

}
