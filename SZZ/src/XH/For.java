package XH;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("请输入该同学五门的成绩：");
        double sum=0;
        int  score=0;
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"门课的成绩：");
			score=scanner.nextInt();
			System.out.println(score);
			sum += score;//sum=score+sum;
		}
		System.out.println("平均分为："+sum/5);
		
	}

}
