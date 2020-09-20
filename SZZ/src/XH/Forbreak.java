package XH;

import java.util.Scanner;

public class Forbreak {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("请输入该同学五门的成绩：");
        double sum=0;
        int  score=0;
        boolean  flag=true;
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"门课的成绩：");
			score=scanner.nextInt();
			if(score<0||score>100) {
				System.out.println("输入有误，程序结束。");
				flag=false;
				break;
			}
			
			System.out.println(score);
			sum += score;//sum=score+sum;
		}
		if(flag==true)
		System.out.println("平均分为："+sum/5);
		
	}

}