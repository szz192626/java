package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreesetNaturalSetDemo {
          public static void main(String[] args) {
        	Set<Dog> set=new TreeSet<Dog>();
      		set.add(new Dog("����",7,"��ë" ));
      		Dog dog=new Dog("����",5,"��ë" );
      		set.add(dog);
     	    set.add(new Dog("����",5,"��ë" ));
//     	    ��ΪDog�е�Comparableʵ���ǽ����������Ƿ�һ�����ж��Ƿ���ͬһ����
//     	    ���������������һ������Ϊ5�Ķ��󣬾Ͳ��ܼӵ�treeSet����
      		set.add(new Dog("����",4,"��ë" ));
      		
//      		set.add(dog);
      	    
      	  Iterator<Dog> iterator=set.iterator();
      	  while(iterator.hasNext()) {
      		  System.out.println(iterator.next());
      	  }
        	  
        	  
 }
}
