package supermarket1;

import java.util.Scanner;

public class SPGL {
            public void merchandise () {
            	 int secondNum = 1;
            	 Scanner scan= new Scanner(System.in);
            	 do {
            		 System.out.println("----------");
            		 System.out.println("\t 1.�����Ʒ");
            		 System.out.println("\t 2.ɾ����Ʒ");
            		 System.out.println("\t 3.������Ʒ");
            		 System.out.println("\t 4.��Ʒ�������");
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
