package FF;

import java.util.Scanner;

public class YHSJ {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("������������");
		int rows=scanner.nextInt();
		int[][] yanghui=new int[rows][];
		for(int i=0;i<yanghui.length;i++) {
			yanghui[i]=new int[i+1];
			for(int j=0;j<yanghui[i].length;j++) {
				if(j==0||j==yanghui[i].length-1) {
					yanghui[i][j]=1;
			
				}
				else {
				yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
				}
             System.out.print("  "+yanghui[i][j]);
		
				
			}
			System.out.println();
		}
    //ʹ����ǿ��forѭ��
		System.out.println("----��ǿ��forѭ��");
		
		for(int[] row:yanghui) {
			for(int element:row) {
				System.out.print("  "+element);
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
