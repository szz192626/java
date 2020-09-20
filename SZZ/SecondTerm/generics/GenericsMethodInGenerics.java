package generics;

import java.sql.Date;

public class GenericsMethodInGenerics<T> {


    public  <E> E getExactOne(E[] arr,int index,T temp){
    	System.out.println(temp);
    	return arr[index];
    }
	public static void main(String[] args) {
		Date[] datearr=new Date[5];
		datearr[0]=new Date(00, 7, 7);
		datearr[1]=new Date(11,8,9);
		datearr[2]=new Date(89, 6, 28);
		datearr[3]=new Date(99, 8, 9);
		datearr[4]=new Date(22, 10, 10);
		
		GenericsMethodInGenerics<String> gmc=new  GenericsMethodInGenerics<String>();
//		date	
		Date datetemp=gmc.getExactOne(datearr, 2, "泛型类的泛型指定，String");

		
		System.out.println(datetemp);
//		Integer
		Integer[] intarr=new Integer[] {1,2,3,4,5};

		int inttemp=gmc.getExactOne(intarr, 2,"第二次数字调用，仍然只能是String");
		System.out.println(inttemp);
//		double
		Double [] douarr=new Double[] {1.23,2.34,4.56,1000.07};
		
		Double doutemp=gmc.getExactOne(douarr, 2,"第三次调用，浮点型只能用String");
		System.out.println(doutemp);
		
	}
}


