package internalclass;


/**
 *    ��Ա�ڲ���
 * 
 *
 */
public class Exernal {
   private  String name;
   public class Internal{
   public void print() {
	System.out.println("����Exernal��Ա�ڲ���Ĵ�ӡ");   
   }
   }
   

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   //�ֲ��ڲ���
	 public void show() {
		 class LocalInternalClass{
			 public void localprint() {
				 System.out.println("���Է����ڲ��ľֲ��ڲ���Ĵ�ӡ");
			 }
		 }
		 LocalInternalClass localInternalClass  =new LocalInternalClass();
	     localInternalClass.localprint();
	
	
	 }
	public void method2() {
		//LocalInternalClass�Ķ���ֻ��show������Ч�����濴�������ͷ����еľֲ�������������һ����
		
	/*	 LocalInternalClass localInternalClass  =new LocalInternalClass();
	     localInternalClass.localprint();  */
	}
	
	//��̬�ڲ���
	
	
	
	
	
	
	
	
	
}
