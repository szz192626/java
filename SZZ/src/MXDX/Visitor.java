package MXDX;

public class Visitor {
  String name;
  int age;
  
  public void buyTicket() {
	  int price=age>16? 30:15;
	   System.out.println(name+",�������Ʊ�۸�Ϊ"+price+"Ԫ");
	  
	  
  }
	
	
	
}
