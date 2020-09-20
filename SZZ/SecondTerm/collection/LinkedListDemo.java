package collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
     public static void main(String[] args) { 
    	 
    	List<Dog> doglist=new LinkedList<>();
     	Dog dog1=new Dog("旺旺",5,"京巴");
     	Dog dog2=new Dog("阿黄",7,"金毛");
     	Dog dog3=new Dog("菲菲",5,"拉布拉多");
     	doglist.add(dog1);
     	doglist.add(dog2);
     	doglist.add(dog3);
     	
     	
     	System.out.println(doglist.size());
     	for(int i=0;i<doglist.size();i++) {
     		System.out.println(doglist.get(i));
     	}
     	
     	if(doglist.contains(dog3)) {
     		doglist.remove(dog3);
     		System.out.println("菲菲狗狗已经在List中了，我已经将其删掉");
     	}else {
     		System.out.println("菲菲狗狗已经不在List中了");
     	}
     	LinkedList<Dog> linkedList=(LinkedList<Dog>)doglist;
//     	linkedList.removeFirst();
     	linkedList.removeLast();
     	
     	System.out.println(doglist.size());
     	for(int i=0;i<doglist.size();i++) {
     		System.out.println(doglist.get(i));
     	}
    	 System.out.println(linkedList.getLast());
    	 
    	 
    	 
  }
}
