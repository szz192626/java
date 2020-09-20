package fengzhuang;

public class Dog {
      private String name ;//私有年龄
      private int age ;//年龄
      private int health;//健康值
      private String strian;//品种
      public void setName(String n) {//编写set方法
    	  this.name = n;
    	  }
      public void setAge(int a) {
    	  this.age=a;
    	  }
      public void setHealth(int h) {
    	  if(h<0||h>100) {
    		  System.out.println("请输入合法的数值1~100");
    		  this.health=60;
    		  return;}
    	  else 
    		  this.health=h;}
      public void setStrain(String s) {
    	  this.strian =s;}
      public String getName() {//开始写get方法
    	  return this.name;}
      public int getAge() {
    	  return this.age;}
      public int getHealth() {
    	  return this.health;}
      public String getStrain() {
    	  return this.strian;}
      public void print() {
    	  System.out.println("小狗的信息：\n 我的名字是："+
      this.getName()+"年龄是："+this.getAge()+
      "健康值是："+this.getHealth()+"品种是："+this.getStrain());
    	  
    		  
    	  }
    	  
      }
      

