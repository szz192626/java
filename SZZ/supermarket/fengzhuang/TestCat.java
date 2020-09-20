package fengzhuang;

public class TestCat {
     public static void main(String[] args) {
    	 Cat cat = new Cat();
    	 cat.setName("波斯猫");//调用set方法调用名字
    	 String name = cat.getName();
    	 cat.month=11;//共有变量可以直接访问设置，而私有变量不行
    	 System.out.println(name);
    	 System.out.println(cat.month);
     }
	}
