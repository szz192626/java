package supermarket1;

import java.util.Scanner;

public class Festivalscost {
	

	public void festivalscost (){
		Scanner scan = new Scanner(System.in);
		int secondNum=0;
		  
		do {
			 
		System.out.println("————————————————");
		System.out.println("每周五所有商品打八八折");
		System.out.println("春节期间年货一律七折");
		System.out.println("儿童节学习用品打六六折");
		System.out.println("七夕节巧克力打七折");
		System.out.println("国庆节商品一律打六折");
		System.out.println("双十一所有商品打四折");
		System.out.println("双十二所有商品打五折");
		System.out.println("————————————————");
		System.out.println("\t 1.停留本界面");
		System.out.println("\t 0.返回上一界面");
		 secondNum =scan.nextInt();
		
		switch(secondNum) {
		case 1:
			Festivalscost fe=new Festivalscost();
			fe.festivalscost();
			break;
		case 0:
			System.out.println("返回上级菜单");
		   break;
		
		  default:
			System.out.println("请输入0-1之间的数");
			
		}			
		}while(secondNum!=0);
		
	}
}


