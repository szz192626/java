package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreesetNaturalSetDemo {
          public static void main(String[] args) {
        	Set<Dog> set=new TreeSet<Dog>();
      		set.add(new Dog("李四",7,"金毛" ));
      		Dog dog=new Dog("张三",5,"金毛" );
      		set.add(dog);
     	    set.add(new Dog("王二",5,"金毛" ));
//     	    因为Dog中的Comparable实现是仅根据年龄是否一样来判断是否是同一对象，
//     	    所以下面出现了另一个年龄为5的对象，就不能加到treeSet中了
      		set.add(new Dog("张三",4,"金毛" ));
      		
//      		set.add(dog);
      	    
      	  Iterator<Dog> iterator=set.iterator();
      	  while(iterator.hasNext()) {
      		  System.out.println(iterator.next());
      	  }
        	  
        	  
 }
}
