package supermarket1;

import java.util.Scanner;

public class GRZX {
         public void individual() {
        	  int secondNum = 1;
        	 	 Scanner scan= new Scanner(System.in);
        	 	 do {
        	 		 System.out.println("----------");
        	 		 System.out.println("\t 1.�޸ĸ�����Ϣ");
        	 		 System.out.println("\t 2.ͳ�Ƹ��˹�������");
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
