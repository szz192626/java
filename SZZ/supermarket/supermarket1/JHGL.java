package supermarket1;
import java.util.Scanner;
public class JHGL {
         public void  purchase() {
        	 int secondNum = 1;
        	 Scanner scan= new Scanner(System.in);
        	 do {
        		 System.out.println("----------");
        		 System.out.println("\t 1.进货查询");
        		 System.out.println("\t 2.进货登记");
        		 System.out.println("\t 0.返回上级菜单");
        		 System.out.println("请输入指令：");
        		 secondNum =scan.nextInt();
        		 
        		 switch (secondNum) {
        			case 1:
        				
        				break;
        			case 2:
        			     
        			break;
        			
        			case 0:
        				System.out.println("返回上级菜单");
        				break;
        			default:
        				System.out.println("请输入0-2之间的数");
        			}
        			} while (secondNum != 0);
        				}
        		
        	 
  }
	
	
	
	
	
	
	
	
	

