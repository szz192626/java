package XH;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("�����������");
		int sum=scanner.nextInt();
		for(int i=0,j=sum;i<=sum&&j>=0;i++,j--) {
			System.out.printf("%d+%d=%d\n",i,j,sum);
			
		}
		
	}

}