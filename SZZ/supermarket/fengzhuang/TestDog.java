package fengzhuang;

import java.util.Scanner;

public class TestDog {
       public static void main(String[] args) {
        	  Scanner  input = new Scanner(System.in);
        	  System.out.println("欢迎来到小狗商店");
        	  System.out.println("请输入小狗的名字：");
        	  String name = input.next();
        	  System.out.println("请输入小狗的年龄：");
        	  int age = input.nextInt();
        	  System.out.println("请输入小狗的健康值：");
        	  int health = input.nextInt();
        	  System.out.println("请输入小狗的品牌：1拉布拉多 2雪瑞纳");
        	  String strain = null;
        	  if(input.nextInt()==1) {
        		  strain = "拉布拉多";}
        	  else {
        		  strain = "雪瑞纳";}
        	  Dog dog = new Dog();
        	  dog.setName(name);
        	  dog.setAge(age);
        	  dog.setHealth(health);
        	  dog.setStrain(strain);
        	  dog.print();
        		  
        	  }
        			  
        	  
        	  
          }

