package supermarket1;

import java.util.Scanner;

public class KCGL {
    public void inventory() {
    	 int secondNum = 1;
    	 Scanner scan= new Scanner(System.in);
    	 do {
    		 System.out.println("----------");
    		 System.out.println("\t 1.商品库存查询");
    		 System.out.println("\t 2.更改库存量");
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
    				System.out.println("请输入0-4之间的数");
    			}
    			} while (secondNum != 0);
    				}
    	
 }

