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
    			System.out.println("��ӭ���뷽�۳��й���ϵͳ��");
    			System.out.println("\t 1.��¼��̨����Աϵͳ");
    			System.out.println("\t 2.��¼ǰ̨����Աϵͳ");
    			System.out.println("\t 3.��¼����Աϵͳ");
    			System.out.println("\t 4.��¼��Ա�˿�ϵͳ");
    	        System.out.println("\t 5.�˳����۹���ϵͳ");
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
    				System.out.println("���˳����۹���ϵͳ");
    				break;
        		default:
        			System.out.println("������1-5֮�����");
    			flag=true;
    		}
    			
    }while(flag==true);
    	
    	}
}
    
	
		  
		
		
		

	


