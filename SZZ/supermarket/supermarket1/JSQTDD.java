package supermarket1;

import java.util.Scanner;

public class JSQTDD {
    public void  orders(){
    	 int secondNum = 1;
     	 Scanner scan= new Scanner(System.in);
     	 do {
     		 System.out.println("----------");
     		 System.out.println("\t 1.��¼������");
     		 System.out.println("\t 2.����ǰ̨�����");
     		 System.out.println("\t 0.�����ϼ��˵�");
     		 System.out.println("������ָ�");
     		 secondNum =scan.nextInt();
     		 
     		 switch (secondNum) {
     			case 1:
     				
     				break;
     			case 2:
     			     
     			break;
     			
     			case 0:
     				System.out.println("�����ϼ��˵�");
     				break;
     			default:
     				System.out.println("������0-2֮�����");
     			}
     			} while (secondNum != 0);
    	
    	
    	
    	
    	
    	
    }
	
}
