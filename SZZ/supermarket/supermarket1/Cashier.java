package supermarket1;

import java.util.Scanner;

public class Cashier {
          public  void  cashier() {
        	  int thirdNum=0;
        	  boolean fla=true; 
        	  Scanner reader=new Scanner(System.in);
        String	 username1="szz";
        String   password1="cmy520";
        String username=null,password=null;
      		boolean flag = true;
    		do {
    		   System.out.println("�������û�����");
    		   username=reader.next();
    		   System.out.println("���������룺");
    		   password = reader.next();
    			   if(username.equals(username1)&& password.equals(password1)) {
    			     System.out.println("��¼�ɹ���"); 
    			     flag = false;
    			   }else {
    			     System.out.println("�û�������������������������롣");
    			   }
    			        
    	}while(flag);

      				
             do {
            	 fla=false;
            	 System.out.println("��ӭ��������Աϵͳ��");
            	 System.out.println("\t.1������Ʒ��");
            	 System.out.println("\t.2������Ʒ��");
            	 System.out.println("\t.3���������Ʒ��Ϣ��");
            	 System.out.println("\t.4��ڼ���۽��ܣ�");
            	 System.out.println("\t.5ע���Ա��");
            	 System.out.println("\t.6��Ա��ѯ��");
            	 System.out.println("\t.7��Ա���ˣ�");
            	 System.out.println("\t.8�˳�����Աϵͳ��������ҳ");
            	 System.out.println("������ָ�");
            	 
            	  thirdNum =  reader.nextInt();
            	switch(thirdNum) {
            	case 1:
            		Shopping shopping = new Shopping();
            		shopping.printThis();
            		break;
            	case 2:
            		
            		break;
            	case 3:
            		
            		break;
            	case 4:
            		Festivalscost fe=new Festivalscost();
            		fe.festivalscost();
            		
            		break;
            	case 5:
            		Registration re=new Registration();
            		re.regitration();
            		break;
            	case 6:
            		
            		break;
                case 7:
            		
            		break;
            	case 8:
            		System.out.println("���˳�����Աϵͳ");
            		break;
            		default:
					System.out.println("������1-8֮�����");
					fla=true;
            	}
             }while(thirdNum!=8&&fla==true);
            	 
            	 
            	 
             }
          }

