package Dm;

import java.util.Scanner;

public class XHCX {

	public static void main(String[] args) {
		Scanner  scan=new  Scanner(System.in);
		int  productNo=0;
	  String  str="y";
	
	while(str.equals("y")) {
		System.out.println("请输入商品编号：");
	
		productNo=scan.nextInt();
		switch(productNo) {
		case 1:
			System.out.println("苹果的价格为5元每斤");
			break;
		case 2:
			System.out.println("香蕉的价格为3元每斤");
			break;
		case 3:
		System.out.println("橙子的价格为4元每斤");
			break;
		default:
			System.out.println("查无此商品");
		}
		System.out.println("还要再次查询吗 y:是  N:否");
		  str=scan.next();
	}

	}

}
