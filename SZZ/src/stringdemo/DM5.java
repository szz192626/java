package stringdemo;

import java.util.Scanner;

public class DM5 {
    public static void main(String [] arg) {
    	Scanner reader=new Scanner(System.in);
    	
    	System.out.println("�������ļ���");
    	
    	String filename=reader.next();
    	int index=filename.indexOf(".java");
    	
    	if(filename.length()==index+".java".length()) {
    		System.out.println("�Ե�");
    	}else {
    		System.out.println("���");
    	}
    	
    	System.out.println();
    	
    	
    }
}
