package supermarket1;
import java.util.Scanner;
public class JHGL {
         public void  purchase() {
        	 int secondNum = 1;
        	 Scanner scan= new Scanner(System.in);
        	 do {
        		 System.out.println("----------");
        		 System.out.println("\t 1.������ѯ");
        		 System.out.println("\t 2.�����Ǽ�");
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
	
	
	
	
	
	
	
	
	

