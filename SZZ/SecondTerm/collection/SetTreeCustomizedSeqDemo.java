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
  		set.add(new Dog("zhangsan",7,"金毛" ));
  		Dog dog=new Dog("lisi     ",5,"金毛" );
  		set.add(dog);
 	    
// 	    因为Dog中的Comparable实现是仅根据年龄是否一样来判断是否是同一对象，
// 	    所以下面出现了另一个年龄为5的对象，就不能加到treeSet中了
  		set.add(new Dog("wanger",4,"金毛" ));
  		set.add(new Dog("zhaoliu",5,"金毛" ));
//  		set.add(dog);
  	    
  	  Iterator<Dog> iterator=set.iterator();
  	  while(iterator.hasNext()) {
  		  System.out.println(iterator.next());
  	  }
    	  

	}

}
