package ZWLX;

public class SZ1 {

	public static void main(String[] args) {
		 int a[]=new int[10],i;
         System.out.println("�մ���������Ԫ�ص�ֵ");
		 for(i=0;i<a.length;i++) { 
			System.out.printf("%5d",a[i]); }
	   System.out.println();
	   for(i=0;i<a.length;i++) {
			 a[i]=2*i;}
		System.out.println("��ֵ���Ԫ��ֵ(����)");
		 for(i=a.length-1;i>=0;i--) {
		System.out.printf("%5d",a[i]);}
		System.out.println();
		
	}

}