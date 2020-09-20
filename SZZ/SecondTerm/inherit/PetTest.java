package inherit;

public class PetTest {

	public static void main(String[] args) {
		
     Dog dog1 =new Dog("ahuang",80,50,"金毛");
     System.out.println(dog1.toString());
     Dog dog2=new Dog ("ahuang",80,50,"金毛");
     System.out.println(dog2);
     Dog dog3 =dog2;
     
     if(dog1.equals(dog2)) {//如果Dog类中没有重写equals方法，则和==是一样的，比较的是两个引用是否指向同一个对象实例
    	 System.out.println("相同的内容，但对象实例不同，这里看做相同");
    	 }else {
         System.out.println("相同的内容，但因两个对象实例引用也不指向同一个对象实例，没有重新时，即便内容相同，也认为不是同一个对象");
    	 }
     
 /*    String str =new String("abc");
     Pet pet1=new Pet();
      pet1=dog1;
      if(str==dog1){
      //在java看来是不可比的，这两个类没有继承关系，java编译不过
       }
     if(pet1==dog1) {
    	 
     }*/
	  }
}