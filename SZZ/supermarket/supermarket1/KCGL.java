package supermarket1;

import java.util.Scanner;

public class KCGL {
    public void inventory() {
    	 int secondNum = 1;
    	 Scanner scan= new Scanner(System.in);
    	 do {
    		 System.out.println("----------");
    		 System.out.println("\t 1.��Ʒ����ѯ");
    		 System.out.println("\t 2.���Ŀ����");
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
    				System.out.println("������0-4֮�����");
    			}
    			} while (secondNum != 0);
    				}
    	
 }
