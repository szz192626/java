package inherit;

public class TestCat {

	public static void main(String[] args) {
		Pet pet =new Cat("�̲�",88,66);
		pet.print();
		System.out.println("---------");
		Master master=new Master("����");
		master.feed(pet,"С���" );
		
	}

}
