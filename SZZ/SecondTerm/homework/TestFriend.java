package homework;

public class TestFriend {

	public static void main(String[] args) {
		Friend chinesefriend =new ChineseFriend("����","�й�");
        chinesefriend.sayHello();
        System.out.println("-----------");
        Friend othercountryfriend =new OthercountryFriend("Hobbo","America");
        othercountryfriend.sayHello();
        Master master=new Master("����");
        master.Serving(chinesefriend, "����", "ˮ��");
        master.Serving(othercountryfriend, "Ӣ��", "����");
	}

}
