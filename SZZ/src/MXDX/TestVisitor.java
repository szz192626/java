package MXDX;

public class TestVisitor {

	public static void main(String[] args) {
		Visitor vsl=new Visitor();
		vsl.name="����";
		vsl.age=15;
		
		Visitor vs2=new Visitor();
		vs2.name="��������";
		vs2.age=70;
		vsl.buyTicket();
		vs2.buyTicket();
		
		

	}

}
