package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPenguin {

	public static void main(String[] args) {
		List<Penguin> penguins=new ArrayList<>(); 
        Penguin penguin1=new Penguin("����","Q��");
        Penguin penguin2=new Penguin("����","Q��");
        Penguin penguin3=new Penguin("����","Q��");
        penguins.add(penguin1);
        penguins.add(penguin2);
        penguins.add(penguin3);
        System.out.println("���� "+penguins.size()+" ֻ���");
        System.out.println("�ֱ��ǣ�");
        Iterator<Penguin> iterator=penguins.iterator();
        while(iterator.hasNext()) {
        	Penguin penguintemp=iterator.next();
        	System.out.println(penguintemp);
        	}
        if(penguins.contains(penguin2)) {
        	penguins.remove(penguin2);
        	System.out.println("��ɾ���������");
        }else {
        	System.out.println("δ�ҵ��������");
        }
        System.out.println("���ڻ��� "+penguins.size()+" ֻ���");
        System.out.println("�ֱ��ǣ�");
        Iterator<Penguin> iterator1=penguins.iterator();
        while(iterator1.hasNext()) {
        	Penguin penguintemp1=iterator1.next();
        	System.out.println(penguintemp1);
        	}
	}

}
