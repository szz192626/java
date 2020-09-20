package internalclass;


/**
 *    成员内部类
 * 
 *
 */
public class Exernal {
   private  String name;
   public class Internal{
   public void print() {
	System.out.println("来自Exernal成员内部类的打印");   
   }
   }
   

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   //局部内部类
	 public void show() {
		 class LocalInternalClass{
			 public void localprint() {
				 System.out.println("来自方法内部的局部内部类的打印");
			 }
		 }
		 LocalInternalClass localInternalClass  =new LocalInternalClass();
	     localInternalClass.localprint();
	
	
	 }
	public void method2() {
		//LocalInternalClass的定义只在show里面有效，外面看不到，和方法中的局部变量的作用是一样的
		
	/*	 LocalInternalClass localInternalClass  =new LocalInternalClass();
	     localInternalClass.localprint();  */
	}
	
	//静态内部类
	
	
	
	
	
	
	
	
	
}
