package homework;

public class TastUser {

	public static void main(String[] args) {
		User user1=new User("����","17327711875");
		User user2=new User("����","18805176609");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("---------------");
        if(user1.equals(user2)) {
        	System.out.println(user1.getName()+"��"+user2.getName()+"����ͬһ�û�");
        	}else {
        		System.out.println(user1.getName()+"��"+user2.getName()+"����ͬһ�û�");
        	}
	}

}
