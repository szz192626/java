package generics;

public class TestGenerics {

	public static void main(String[] args) {
	    Box<String, Integer >box = new Box<String,Integer>("����",2);	
	    System.out.println(box);
		Box<ToyCat, Cloth>box1 =new Box<>(new ToyCat("è��"),new Cloth());
		System.out.println(box1);
      //������Ϊ���͵���ʵ��������ָ��������Ϊ��Ӧ���͵������ 
	  //Box<Object,Object> box2=new Box<ToyCat,Cloth>(new ToyCat("è��"),new Cloth());
	}

}
