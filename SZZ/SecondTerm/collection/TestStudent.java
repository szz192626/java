package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		Map<String,Student>map=new HashMap<String,Student>();
        map.put("1902343227",new Student("����",18,"Ů"));
        map.put("1902343225", new Student("��",19,"Ů"));
        map.put("1902343238", new Student("����", 19, "Ů"));
        Student s1=map.get("1902343225");
        if(s1!=null) {
        	System.out.println(map.get("1902343225"));
        }else {
        	System.out.println("δ�ҵ���ѧ���������Ϣ��");
        }
        System.out.println("--------------------");
        Student s2=map.get("1902343227");
        if(s2!=null) {
        	System.out.println(map.get("1902343227"));
        }else {
        	System.out.println("δ�ҵ���ѧ���������Ϣ��");
        }
        System.out.println("--------------------");
        Student s3=map.get("1902343232");
        if(s3!=null) {
        	System.out.println(map.get("1902343232"));
        }else {
        	System.out.println("δ�ҵ���ѧ���������Ϣ��");
        }
        System.out.println("-----------����ѧ����Ϣ-------------------------");
        Set<Map.Entry<String, Student>>entries=map.entrySet();
        Iterator<Map.Entry<String, Student>>iterator=entries.iterator();
        while (iterator.hasNext()) {
			Map.Entry<String ,Student>entry=iterator.next();
			System.out.println("ѧ�ţ�["+entry.getKey()+"],\n������Ϣ��[\n"+entry.getValue()+"]");
			
		}
        
        
	}

}