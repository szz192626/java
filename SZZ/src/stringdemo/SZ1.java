
package stringdemo;

import java.util.Scanner;

public class SZ1 {    
		public static void main(String[] args) {        
		int [][] a=new int [5][];        
		double[][] b=new double [5][4];        
		int i,j,sum,max,min;        
		double ave;        
		Scanner x=new Scanner(System.in);       
		for(i=0;i<5;i++) {            
		int length=(int)(2*Math.random()+3);            
		a[i]=new int[length];            
		System.out.println("�����"+(i+1)+"��ͬѧ��"+length+"�ųɼ�");            
		for(j=0;j<length;j++) {                
		a[i][j]=x.nextInt();           
		 }        
		}       
		 for(i=0;i<5;i++) {           
		 sum=0;           
		 max=min=a[i][0];            
		for(j=0;j<a[i].length;j++) {                
		sum+=a[i][j];               
		 if(a[i][j]>max) {                    
		max=a[i][j];                
		}                
		if(a[i][j]<min) {                    
		min=a[i][j];                
		}           
		 }            
		ave=sum/j;            
		b[i][0]=sum;            
		b[i][1]=ave;            
		b[i][2]=max;           
		 b[i][3]=min;       
		 }        
		System.out.println("�ܷ�"+"\t"+"ƽ����"+"\t"+"���ֵ"+"\t"+"��Сֵ"+"\t");       
		 for(i=0;i<5;i++) {            
		System.out.print("��"+(i+1)+"��ͬѧ");            
		for(j=0;j<4;j++) {                
		System.out.print(b[i][j]+"\t");            
		}           
		 System.out.println();        
		}    
		}
		

}

