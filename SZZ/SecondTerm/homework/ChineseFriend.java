package homework;
/**
 *     中国朋友类
 * 
 *
 */
public class ChineseFriend extends Friend{
     public ChineseFriend() {
    	 
     }
	 public ChineseFriend(String name,String from) {
		 super(name,from);
	 }
	
	public void sayHello() {
	System.out.println(getName()+"说：你好");
	System.out.println("我来自"+getFrom());
	
		
	}
	}
