package homework;
/**
 *    ���������
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
		System.out.println(getName()+"˵��Hello��");
		System.out.println("I am from  "+getFrom());
	}
    }
