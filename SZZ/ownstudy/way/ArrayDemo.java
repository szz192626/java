package way;

public class ArrayDemo {
   public static void main(String[] args) {
	   int[] ary1= {2,4,6,8,10};//声明并初始化数组1
	   int[] ary2;//声明数组2
	   
	   ary2=ary1;//将数组1赋值给数组2
	   ary2[3]=1024;//通过数组2修改其中一个数组的值
	   //数组的迭代 第一种
	   //打印出数组1中的元素
	   System.out.println("数组1中的元素");
	   for(int i=0;i<ary1.length;i++) {
		   System.out.println(ary1[i]);
	   }
	   //打印出数组2中的元素
	   System.out.println("数值2中的元素");
	   for(int i=0;i<ary2.length;i++) {
		   System.out.println(ary2[i]);
		   }
	   System.out.println("-------------------");
	   //数组的迭代 第二种
	   //增强for循环
	   int []b1= new int[] {1,2,3,4,5,6,7 };
	   for(int x:b1) {
		   System.out.println(x);
	   }
	   System.out.println("---------------");
	   //多重数组的迭代
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
	   
   

