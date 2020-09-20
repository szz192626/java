package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListlteratorDemo {

	public static void main(String[] args) {
		List<Dog> doglist=new ArrayList<>(); 
		Dog dog1=new Dog("旺旺",5,"京巴");
   	    Dog dog2=new Dog("阿黄",7,"金毛");
    	Dog dog3=new Dog("菲菲",5,"拉布拉多");
    	doglist.add(dog1);
    	doglist.add(dog2);
    	doglist.add(dog3);
    	doglist.add(new Dog("小小",3,"雪纳瑞"));
//    	遍历的第二种方式,推荐，适用于所有collection的实现集合类
    	System.out.println("---lterator遍历collection----");
       Iterator<Dog> iterator=doglist.iterator();
    	while(iterator.hasNext()) {
    		Dog dogtemp=iterator.next();
    		System.out.println(dogtemp);
    		
    	}
// 遍历的第三种方式
    	System.out.println("----增强for循环遍历list----");
    	for(Dog dog:doglist) {
    		System.out.println(dog);
    	}
	}

}
