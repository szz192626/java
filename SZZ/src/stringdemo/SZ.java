package stringdemo;


import java.util.Scanner;

public class SZ {

	public static void main(String[] args) {
	  
	  int num=0;double re=0;
	  double [][]arr1=new double[5][]; 
	  double [][]arr2=new double[5][4];
	  double[]sum=new double[5];
	  double[]arg=new double[5];
	  
	   for(int i=0;i<arr1.length;i++) {
		  num =(int)(2*Math.random()+3);  
		  arr1[i]=new double[num];
	      System.out.printf("正在准备存放第%d位学生的%d门成绩：\n",i+1,num);
		  System.out.println("-----------------------------------------------------");
	      Scanner scan=new Scanner(System.in);
		    for(int j=0;j<num;j++) {
			   System.out.printf("请输入该学生的第%d门课成绩\n:",j+1);
			   arr1[i][j]=scan.nextDouble();
		    }
		   
	   }
		  System.out.println("-----------------------------------------------------");
	   
	   for(int i=0;i<arr1.length;i++) {
		    for(int j=0;j<arr1[i].length;j++) {
		     sum[i]+=arr1[i][j];
		    }
        arg[i]=sum[i]/arr1[i].length;
	   }
		
	   for(int i=0;i<arr1.length;i++) {
			for(int cs=0;cs<arr1[i].length-1;cs++) {
				   for(int j=0;j<arr1[i].length-1-cs;j++) {
					  if(arr1[i][j]>arr1[i][j+1]) {
						re=arr1[i][j];
						arr1[i][j]=arr1[i][j+1];
						arr1[i][j+1]=re;
					  } 
				   }	  
			}	
	   }
	   
	   for(int i=0,j=0;i<arr1.length;i++) {
		   arr2[i][j]=sum[i];
		   arr2[i][j+1]=arg[i];
		   arr2[i][j+2]=arr1[i][arr1[i].length-1];
		   arr2[i][j+3]=arr1[i][j];
	   }
	   System.out.println("-----------------------------------------------------");
	   System.out.println("   "+"总分："+"   "+"平均分："+"   "+"最高分："+"   "+"最低分："); 
	   
   for(double[] x:arr2) {
		   for(double y:x) {
			  System.out.print("   "+y); 
		   }
		   System.out.println();
	   }
	System.out.println("-----------------------------------------------------");

	}

}
