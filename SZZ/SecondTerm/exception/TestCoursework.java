package exception;

import java.util.Scanner;

public class TestCoursework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("输入1-3之间任意一个数字：");
        
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
			System.out.println("数据库");
			break;
		default:
			System.out.println("请输入1-3之间任意一个数字");
			break;
		}
       }catch (NumberFormatException e) {
    	   System.out.println("程序运行时发现数字异常，并成功捕获了！");
       }catch(Exception e){
    	   System.out.println("发现其他异常，已被捕获!");
    	   System.exit(1);
	   }finally {
		System.out.println("终止");
	}	
       System.out.println("感谢使用本程序。。。。"); 
	}

}
