package XH;

import java.util.Scanner;

public class Forbreak {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("�������ͬѧ���ŵĳɼ���");
        double sum=0;
        int  score=0;
        boolean  flag=true;
		for(int i=0;i<5;i++) {
			System.out.println("�������"+(i+1)+"�ſεĳɼ���");
			score=scanner.nextInt();
			if(score<0||score>100) {
				System.out.println("�������󣬳��������");
				flag=false;
				break;
			}
			
			System.out.println(score);
			sum += score;//sum=score+sum;
		}
		if(flag==true)
		System.out.println("ƽ����Ϊ��"+sum/5);
		
	}

}