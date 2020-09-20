package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMapDemo {

	public static void main(String[] args) {
		Map<Dog,String> map=new TreeMap<Dog,String>();
		map.put(new Dog("����",4,"��ë"), "�Ű���");
		map.put(new Dog("����",7,"��������"), "����");
		map.put(new Dog("����",5,"����"), "������");
		System.out.println(map);
		System.out.println(map.size());
//		hashmap��key������ȵ�ԭ��ͬhashset
		map.put(new Dog("����",6,"����"), "������");
		
//		�Դ�������ӡ
//		System.out.println(map.size());
//		System.out.println(map);
		
//		��һ�ֱ�����ʹ��entry��Ŀset��������ͬʱʹ��iterator
		Set<Map.Entry<Dog, String>>entries=map.entrySet();
		Iterator<Map.Entry<Dog, String>>iterator=entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Dog, String>entry=iterator.next();
			System.out.println("key=["+entry.getKey()+"],value["+entry.getValue()+"]");
		}
//		�ڶ���
		System.out.println("-----------�ڶ��ֱ�������,�ǵ�һ�ֵ�����-------------------");
		for(Map.Entry<Dog, String>entry:entries) {
			System.out.println("key=["+entry.getKey()+"],value["+entry.getValue()+"]");
		}
//		������
		System.out.println("-----------�����ֱ�������,ʹ��keySet��ȡkey��Ȼ������Map��get��ȡvalue-------------------");
		Set<Dog>dogset=map.keySet();
		for(Dog dog:dogset) {
			System.out.println("key=["+dog+"],value["+map.get(dog)+"]");
		}
//		������
		System.out.println("-----------�����ֱ�������,ʹ��iterator������ȡkey��Ȼ������Map��get��ȡvalue-------------------");
		Iterator<Dog>iterator2=dogset.iterator();
		while(iterator2.hasNext()) {
			Dog dog2=iterator2.next();
			System.out.println("key=["+dog2+"],value["+map.get(dog2)+"]");
		}
		
		
		
		
		
		
		
		
		
		

	}

}