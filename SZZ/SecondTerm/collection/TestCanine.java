package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCanine {

	public static void main(String[] args) {
		Set<Canine>set=new HashSet<Canine>();
        Canine canine=new Canine("������ʿ��", "17327711875");
        set.add(new Canine("���۹�ʿ��", "18805176609"));
        set.add(canine);
        set.add(new Canine("���۹�ʿ��", "13705240696"));
        set.add(new Canine("���۹�ʿ��", "18805176609"));
        Iterator<Canine>iterator=set.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
	}

}
