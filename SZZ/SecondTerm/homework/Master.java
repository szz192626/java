package homework;
/**
 *    ������
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
		System.out.println("��������"+getName());
		System.out.println("------------");
		friend.sayHello();
		System.out.println(getName()+"˵�������Խ������·���");
		System.out.println("  �ṩ"+language+"��ͨ����");
		System.out.println("  ѡ��"+food+"Ʒ��");
	}
	}
