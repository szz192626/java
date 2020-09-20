package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		Map<String,Student>map=new HashMap<String,Student>();
        map.put("1902343227",new Student("方方",18,"女"));
        map.put("1902343225", new Student("楠楠",19,"女"));
        map.put("1902343238", new Student("沁沁", 19, "女"));
        Student s1=map.get("1902343225");
        if(s1!=null) {
        	System.out.println(map.get("1902343225"));
        }else {
        	System.out.println("未找到该学生的相关信息！");
        }
        System.out.println("--------------------");
        Student s2=map.get("1902343227");
        if(s2!=null) {
        	System.out.println(map.get("1902343227"));
        }else {
        	System.out.println("未找到该学生的相关信息！");
        }
        System.out.println("--------------------");
        Student s3=map.get("1902343232");
        if(s3!=null) {
        	System.out.println(map.get("1902343232"));
        }else {
        	System.out.println("未找到该学生的相关信息！");
        }
        System.out.println("-----------遍历学生信息-------------------------");
        Set<Map.Entry<String, Student>>entries=map.entrySet();
        Iterator<Map.Entry<String, Student>>iterator=entries.iterator();
        while (iterator.hasNext()) {
			Map.Entry<String ,Student>entry=iterator.next();
			System.out.println("学号：["+entry.getKey()+"],\n具体信息：[\n"+entry.getValue()+"]");
			
		}
        
        
	}

}
