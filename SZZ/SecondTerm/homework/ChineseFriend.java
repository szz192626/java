package homework;
/**
 *     �й�������
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
	System.out.println(getName()+"˵�����");
	System.out.println("������"+getFrom());
	
		
	}
	}
