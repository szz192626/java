package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListlteratorDemo {

	public static void main(String[] args) {
		List<Dog> doglist=new ArrayList<>(); 
		Dog dog1=new Dog("����",5,"����");
   	    Dog dog2=new Dog("����",7,"��ë");
    	Dog dog3=new Dog("�Ʒ�",5,"��������");
    	doglist.add(dog1);
    	doglist.add(dog2);
    	doglist.add(dog3);
    	doglist.add(new Dog("СС",3,"ѩ����"));
//    	�����ĵڶ��ַ�ʽ,�Ƽ�������������collection��ʵ�ּ�����
    	System.out.println("---lterator����collection----");
       Iterator<Dog> iterator=doglist.iterator();
    	while(iterator.hasNext()) {
    		Dog dogtemp=iterator.next();
    		System.out.println(dogtemp);
    		
    	}
// �����ĵ����ַ�ʽ
    	System.out.println("----��ǿforѭ������list----");
    	for(Dog dog:doglist) {
    		System.out.println(dog);
    	}
	}

}
