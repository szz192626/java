package XH;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("�������ͬѧ���ŵĳɼ���");
        double sum=0;
        int  score=0;
		for(int i=0;i<5;i++) {
			System.out.println("�������"+(i+1)+"�ſεĳɼ���");
			score=scanner.nextInt();
			System.out.println(score);
			sum += score;//sum=score+sum;
		}
		System.out.println("ƽ����Ϊ��"+sum/5);
		
	}

}