package collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
     public static void main(String[] args) { 
    	 
    	List<Dog> doglist=new LinkedList<>();
     	Dog dog1=new Dog("����",5,"����");
     	Dog dog2=new Dog("����",7,"��ë");
     	Dog dog3=new Dog("�Ʒ�",5,"��������");
     	doglist.add(dog1);
     	doglist.add(dog2);
     	doglist.add(dog3);
     	
     	
     	System.out.println(doglist.size());
     	for(int i=0;i<doglist.size();i++) {
     		System.out.println(doglist.get(i));
     	}
     	
     	if(doglist.contains(dog3)) {
     		doglist.remove(dog3);
     		System.out.println("�Ʒƹ����Ѿ���List���ˣ����Ѿ�����ɾ��");
     	}else {
     		System.out.println("�Ʒƹ����Ѿ�����List����");
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