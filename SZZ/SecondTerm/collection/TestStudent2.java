package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestStudent2 {

	public static void main(String[] args) {
		Map<String, List<Student2>> map = new HashMap<String, List<Student2>>();
		List<Student2> commonClass = new ArrayList<Student2>();
		List<Student2> strengthenClass = new ArrayList<Student2>();
		map.put("普通班", commonClass);
		map.put("强化班", strengthenClass);
		Student2 student2=new Student2("1902343232", "周舟");
		Student2 student3=new Student2("1902343227","方方");
        Student2 student4=new Student2("1902343201","志强");
        Student2 student5=new Student2("1902343202", "子祥");
        commonClass.add(student2);
        commonClass.add(student3);
        strengthenClass.add(student4);
        strengthenClass.add(student5);
        System.out.println("---------遍历学生信息-------------------");
        Set<Map.Entry<String, List<Student2>>>entries=map.entrySet();
        Iterator<Map.Entry<String, List<Student2>>>iterator=entries.iterator();
        while(iterator.hasNext()) {
        	Map.Entry<String, List<Student2>>entry=iterator.next();
        	System.out.println(entry.getKey()+"\n"+entry.getValue());
        }
        }

}
