package way;

public class ArrayDemo {
   public static void main(String[] args) {
	   int[] ary1= {2,4,6,8,10};//��������ʼ������1
	   int[] ary2;//��������2
	   
	   ary2=ary1;//������1��ֵ������2
	   ary2[3]=1024;//ͨ������2�޸�����һ�������ֵ
	   //����ĵ��� ��һ��
	   //��ӡ������1�е�Ԫ��
	   System.out.println("����1�е�Ԫ��");
	   for(int i=0;i<ary1.length;i++) {
		   System.out.println(ary1[i]);
	   }
	   //��ӡ������2�е�Ԫ��
	   System.out.println("��ֵ2�е�Ԫ��");
	   for(int i=0;i<ary2.length;i++) {
		   System.out.println(ary2[i]);
		   }
	   System.out.println("-------------------");
	   //����ĵ��� �ڶ���
	   //��ǿforѭ��
	   int []b1= new int[] {1,2,3,4,5,6,7 };
	   for(int x:b1) {
		   System.out.println(x);
	   }
	   System.out.println("---------------");
	   //��������ĵ���
	   int [][]a= new int [][]{{1,2},{3,4}};
	   for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a[i].length;j++) {
			   System.out.println(a[i][j]);
		   }
	   }
	   System.out.println("--------------");
		int [][]b= new int [2][];
		b[0]= new int []{1,2,3};
		b[1]= new int []{4,5,67,4};
		for(int s=0;s<b.length;s++) {
			for(int z=0;z<b[s].length;z++) {
				System.out.println(b[s][z]);
				
			}
		}
		
   }	   
   }
	   
   

