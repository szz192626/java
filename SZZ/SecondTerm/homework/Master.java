package homework;
/**
 *    主人类
 * 
 *
 */
public class Master {
     private String name;
   public Master() {
	   
   }
	public Master(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Serving(Friend friend,String language,String food) {
		System.out.println("------------");
		System.out.println("主人名："+getName());
		System.out.println("------------");
		friend.sayHello();
		System.out.println(getName()+"说：您可以接受以下服务：");
		System.out.println("  提供"+language+"沟通服务");
		System.out.println("  选择"+food+"品尝");
	}
	}
