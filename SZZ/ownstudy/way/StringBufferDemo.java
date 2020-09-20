package way;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer strBuf=new StringBuffer("Java");
		strBuf.append(" Guide Ver1/");//Á¬½Ó
		System.out.println(strBuf);
		strBuf.append(3);
		System.out.println(strBuf);
		
		strBuf.insert(5, "Student ");//²åÈë
		System.out.println(strBuf);
		
		strBuf.setCharAt(20, '.');//Ìæ»»×Ö·û
		System.out.println(strBuf);
		
		strBuf.reverse();//µ¹Ðð
		System.out.println(strBuf);
		String  str =strBuf.toString();
	 	System.out.println(str);
		
		

	}

}
