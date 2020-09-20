package inherit;

public class TestCat {

	public static void main(String[] args) {
		Pet pet =new Cat("奶茶",88,66);
		pet.print();
		System.out.println("---------");
		Master master=new Master("方方");
		master.feed(pet,"小鱼干" );
		
	}

}
