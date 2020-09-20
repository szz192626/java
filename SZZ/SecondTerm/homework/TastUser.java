package homework;

public class TastUser {

	public static void main(String[] args) {
		User user1=new User("方方","17327711875");
		User user2=new User("方方","18805176609");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("---------------");
        if(user1.equals(user2)) {
        	System.out.println(user1.getName()+"与"+user2.getName()+"不是同一用户");
        	}else {
        		System.out.println(user1.getName()+"与"+user2.getName()+"不是同一用户");
        	}
	}

}
