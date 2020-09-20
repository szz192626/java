package exception;
import java.util.Scanner;
public class TestMultiplecatch {
       
    
	public static void main(String[] args) {
		
		       Scanner in=new Scanner(System.in);
		        System.out.println("请输入被除数：");
		        try {
		        int num1 =in.nextInt();
		        System.out.println("请输入除数：");
		        int num2 =in.nextInt();
		       
		        System.out.println(String.format("%d / %d =%d",num1,num2,num1/num2));
		        }catch(ArithmeticException ex) {
		        	System.out.println("程序运行时发现算数异常，并成功捕获了！");
		        }catch(Exception ex) {
		             System.out.println("程序运行时发现异常，并成功捕获了！");
		            ex.printStackTrace(); //关键点
		             System.exit(1);//强制退出
		             return;
                 }finally {
						System.out.println("计算的过程到此完成");
					}
		        System.out.println("感谢使用本程序！");

			}

		
}
	


