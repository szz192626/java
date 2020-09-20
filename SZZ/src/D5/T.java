package D5;

public class T {

	public static void main(String[] args) {
     int a=-65536;
     int b=-255;
/*	System.out.println(a);
	System.out.println(b);*/
    
     
	 System.out.println("a=\t"+Integer.toBinaryString(a));
	 System.out.println("a=\t"+Integer.toBinaryString(b));
     int c=a&b;
     System.out.println("a&b=\t"+Integer.toBinaryString(c));
c=a|b;
System.out.println("a|b=\t"+Integer.toBinaryString(c));
     c=a^b;
     System.out.println("a^b=\t"+Integer.toBinaryString(c));
c=~a;
System.out.println("~a=\t"+Integer.toBinaryString(c));

int d=a<<3;
System.out.println("a<<3=\t"+Integer.toBinaryString(d));
int e=a>>3;
System.out.println("a<<3=\t"+Integer.toBinaryString(e));
System.out.println("a="+a);
System.out.println("a<<3="+d);
System.out.println("a>>3"+d);
System.out.println("a="+a+",a<<3="+d);


  // System.out.println(a>b?"a大于b":"a小于等于b");






	}

}
