package com.chinsofti.bank.test;



public class TestPassByValue {
	
      public void add(int x) {
    	  x++;
    	  System.out.println("add()������x="+x);
      }
	public static void main (String[] args) {
		TestPassByValue pass=new TestPassByValue();
           int x =100;
           pass.add(x);
           System.out.println("main()������x="+x);
	}
	
	
	
	
	
	
	
	
	
}
