package fengzhuang;

public class Dog {
      private String name ;//˽������
      private int age ;//����
      private int health;//����ֵ
      private String strian;//Ʒ��
      public void setName(String n) {//��дset����
    	  this.name = n;
    	  }
      public void setAge(int a) {
    	  this.age=a;
    	  }
      public void setHealth(int h) {
    	  if(h<0||h>100) {
    		  System.out.println("������Ϸ�����ֵ1~100");
    		  this.health=60;
    		  return;}
    	  else 
    		  this.health=h;}
      public void setStrain(String s) {
    	  this.strian =s;}
      public String getName() {//��ʼдget����
    	  return this.name;}
      public int getAge() {
    	  return this.age;}
      public int getHealth() {
    	  return this.health;}
      public String getStrain() {
    	  return this.strian;}
      public void print() {
    	  System.out.println("С������Ϣ��\n �ҵ������ǣ�"+
      this.getName()+"�����ǣ�"+this.getAge()+
      "����ֵ�ǣ�"+this.getHealth()+"Ʒ���ǣ�"+this.getStrain());
    	  
    		  
    	  }
    	  
      }
      

