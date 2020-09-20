package homework;

public class TestFriend {

	public static void main(String[] args) {
		Friend chinesefriend =new ChineseFriend("方方","中国");
        chinesefriend.sayHello();
        System.out.println("-----------");
        Friend othercountryfriend =new OthercountryFriend("Hobbo","America");
        othercountryfriend.sayHello();
        Master master=new Master("龙腾");
        master.Serving(chinesefriend, "汉语", "水饺");
        master.Serving(othercountryfriend, "英语", "披萨");
	}

}
