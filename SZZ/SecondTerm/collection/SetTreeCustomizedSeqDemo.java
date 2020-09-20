package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeCustomizedSeqDemo {

	public static void main(String[] args) {
		Comparator<Dog>comparator=new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		
		Set<Dog> set=new TreeSet<Dog>(comparator);
  		set.add(new Dog("zhangsan",7,"��ë" ));
  		Dog dog=new Dog("lisi     ",5,"��ë" );
  		set.add(dog);
 	    
// 	    ��ΪDog�е�Comparableʵ���ǽ����������Ƿ�һ�����ж��Ƿ���ͬһ����
// 	    ���������������һ������Ϊ5�Ķ��󣬾Ͳ��ܼӵ�treeSet����
  		set.add(new Dog("wanger",4,"��ë" ));
  		set.add(new Dog("zhaoliu",5,"��ë" ));
//  		set.add(dog);
  	    
  	  Iterator<Dog> iterator=set.iterator();
  	  while(iterator.hasNext()) {
  		  System.out.println(iterator.next());
  	  }
    	  

	}

}