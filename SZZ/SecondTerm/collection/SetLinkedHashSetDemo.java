package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Dog> set=new LinkedHashSet<Dog>();
		set.add(new Dog("����",4,"��ë" ));
		Dog dog=new Dog("����",5,"��ë" );
		
	    set.add(dog);
	    set.add(new Dog("����",5,"��ë" ));
		set.add(new Dog("����",5,"��ë" ));
		set.add(new Dog("����",8,"��ë"));
//		set.add(dog);
	    
	  Iterator<Dog> iterator=set.iterator();
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
}
}