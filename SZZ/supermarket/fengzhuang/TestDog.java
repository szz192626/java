package fengzhuang;

import java.util.Scanner;

public class TestDog {
       public static void main(String[] args) {
        	  Scanner  input = new Scanner(System.in);
        	  System.out.println("��ӭ����С���̵�");
        	  System.out.println("������С�������֣�");
        	  String name = input.next();
        	  System.out.println("������С�������䣺");
        	  int age = input.nextInt();
        	  System.out.println("������С���Ľ���ֵ��");
        	  int health = input.nextInt();
        	  System.out.println("������С����Ʒ�ƣ�1�������� 2ѩ����");
        	  String strain = null;
        	  if(input.nextInt()==1) {
        		  strain = "��������";}
        	  else {
        		  strain = "ѩ����";}
        	  Dog dog = new Dog();
        	  dog.setName(name);
        	  dog.setAge(age);
        	  dog.setHealth(health);
        	  dog.setStrain(strain);
        	  dog.print();
        		  
        	  }
        			  
        	  
        	  
          }

