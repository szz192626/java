package exception;

import java.util.Scanner;

public class TestCoursework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("����1-3֮������һ�����֣�");
        
       try { 
    	   int i=scan.nextInt();
        switch (i) {
		case 1:
			System.out.println("java");
			break;
		case 2:
			
			System.out.println("HTML5+CSS3");
			break;
		case 3:
			System.out.println("���ݿ�");
			break;
		default:
			System.out.println("������1-3֮������һ������");
			break;
		}
       }catch (NumberFormatException e) {
    	   System.out.println("��������ʱ���������쳣�����ɹ������ˣ�");
       }catch(Exception e){
    	   System.out.println("���������쳣���ѱ�����!");
    	   System.exit(1);
	   }finally {
		System.out.println("��ֹ");
	}	
       System.out.println("��лʹ�ñ����򡣡�����"); 
	}

}
