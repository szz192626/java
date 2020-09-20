package generics;

public class TestGenerics {

	public static void main(String[] args) {
	    Box<String, Integer >box = new Box<String,Integer>("数字",2);	
	    System.out.println(box);
		Box<ToyCat, Cloth>box1 =new Box<>(new ToyCat("猫咪"),new Cloth());
		System.out.println(box1);
      //父类作为泛型的类实例，不能指向子类作为对应泛型的类对象。 
	  //Box<Object,Object> box2=new Box<ToyCat,Cloth>(new ToyCat("猫咪"),new Cloth());
	}

}
