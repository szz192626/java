package supermarket1;

import java.util.Scanner;

public class GRZX {
         public void individual() {
        	  int secondNum = 1;
        	 	 Scanner scan= new Scanner(System.in);
        	 	 do {
        	 		 System.out.println("----------");
        	 		 System.out.println("\t 1.修改个人信息");
        	 		 System.out.println("\t 2.统计个人工作收益");
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
