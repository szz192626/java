package internalclass;



public class TestInternalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//成员内部类
       
       
       Exernal.Internal internal2=new Exernal().new Internal();
       
       internal2.print();
       //局部内部类测试
       Exernal exter=new  Exernal();
       exter.show();
       //静态内部类测试
       
       
	}

}
