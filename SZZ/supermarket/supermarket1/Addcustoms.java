package supermarket1;
import java.util.Scanner;
public class Addcustoms {
	public  void addcustoms(){
		  boolean flag = true;
		  Customs cus = new Customs();
		  int	fifthNum=0;String name;int id;String gender;
		while(true) {
			System.out.println("-----------");
			System.out.print("\t ��-1�˳��༭");
			System.out.print("\t ��1����༭");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
		if(num!=-1) {
			System.out.println("   *��ţ�    ");
			fifthNum=in.nextInt();
			System.out.println("   *������    ");
			name=in.next();
			System.out.println("   *�Ա�    ");
			gender=in.next();
			System.out.println("   *���ţ�    ");
			id=in.nextInt();
			flag = false;
			}else {
		      if(num==-1) {
				cus.customs();
			}
			}
		
		
		System.out.println("�ѳɹ���ӣ�");
		
		}
	  
	  }

}
