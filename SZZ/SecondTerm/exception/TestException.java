package exception;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("�����뱻������");
        try {
        int num1 =in.nextInt();
        System.out.println("�����������");
        int num2 =in.nextInt();
        System.out.println(String.format("%d / %d =%d",num1,num2,num1/num2));
        }catch(Exception ex) {
             System.out.println("��������ʱ�����쳣�����ɹ������ˣ�");
//            ex.printStackTrace(); 
             System.exit(1);//ǿ���˳�
             return;
             }finally {
				System.out.println("����Ĺ��̵������");
			}
        System.out.println("��лʹ�ñ�����");

	}

}