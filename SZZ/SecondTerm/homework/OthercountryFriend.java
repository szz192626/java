package homework;
/**
 *    外国朋友类
 * 
 *
 */
   public class OthercountryFriend extends Friend{
    public OthercountryFriend() {
    	
    }
    public OthercountryFriend(String name,String from) {
    	super(name,from);
    }
	
	public void sayHello() {
		System.out.println(getName()+"说：Hello！");
		System.out.println("I am from  "+getFrom());
	}
    }
