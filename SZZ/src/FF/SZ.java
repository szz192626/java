package FF;

import java.util.Scanner;

public class SZ {

	public static void main(String[] args) {
	   String[] strarr=new String[] {"abc","def","ghi","xyz"};
	   Scanner  scan =new Scanner(System.in);
	   System.out.println("������Ҫ�滻xyz���ַ�����");
	   strarr[3]=scan.nextLine(); 
	   
	   
	   for(int i=0;i<strarr.length;i++) {
		   System.out.println(strarr[i]);
	   }
	   

	}

}
