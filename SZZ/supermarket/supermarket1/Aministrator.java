package supermarket1;
import java.util.Scanner;
public class Aministrator{
    
    public static void main(String[]args) {
                Scanner scan= new Scanner(System.in);
    			int oneNum =1;
    			boolean flag=true; 
    			
    			
    			do {
    				flag=false;
    			System.out.println("----------");
    			System.out.println("欢迎进入方舟超市购物系统：");
    			System.out.println("\t 1.登录后台管理员系统");
    			System.out.println("\t 2.登录前台管理员系统");
    			System.out.println("\t 3.登录收银员系统");
    			System.out.println("\t 4.登录会员顾客系统");
    	        System.out.println("\t 5.退出方舟购物系统");
    			oneNum=scan.nextInt();
    			switch(oneNum) {
    			case 1:
    				Aministrator2 am=new Aministrator2();
    				am.aministrator();
    				flag=true;
    				break;
    			case 2:
    				Aministrator3 am3= new Aministrator3();
    				am3.aministrator3();
    				flag=true;
    				break;
    			case 3:
    				Cashier ca=new Cashier();
    				ca.cashier();
    				flag=true;
    				break;
    			case 4:
    				
    			break;
    			case 5:
    				System.out.println("已退出方舟购物系统");
    				break;
        		default:
        			System.out.println("请输入1-5之间的数");
    			flag=true;
    		}
    			
    }while(flag==true);
    	
    	}
}
    
	
		  
		
		
		

	


