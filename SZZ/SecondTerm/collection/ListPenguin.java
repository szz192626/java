package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPenguin {

	public static void main(String[] args) {
		List<Penguin> penguins=new ArrayList<>(); 
        Penguin penguin1=new Penguin("方方","Q妹");
        Penguin penguin2=new Penguin("沁沁","Q妹");
        Penguin penguin3=new Penguin("周舟","Q仔");
        penguins.add(penguin1);
        penguins.add(penguin2);
        penguins.add(penguin3);
        System.out.println("共有 "+penguins.size()+" 只企鹅");
        System.out.println("分别是：");
        Iterator<Penguin> iterator=penguins.iterator();
        while(iterator.hasNext()) {
        	Penguin penguintemp=iterator.next();
        	System.out.println(penguintemp);
        	}
        if(penguins.contains(penguin2)) {
        	penguins.remove(penguin2);
        	System.out.println("已删除企鹅沁沁");
        }else {
        	System.out.println("未找到企鹅沁沁");
        }
        System.out.println("现在还有 "+penguins.size()+" 只企鹅");
        System.out.println("分别是：");
        Iterator<Penguin> iterator1=penguins.iterator();
        while(iterator1.hasNext()) {
        	Penguin penguintemp1=iterator1.next();
        	System.out.println(penguintemp1);
        	}
	}

}
