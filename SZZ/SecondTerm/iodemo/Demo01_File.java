package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class Demo01_File {

	
	
	@Test  //JUnit��������java�������
	public  void  TextFile() { 
		System.out.println("JUnit�ĵ�һ������");
	
    File file1=new File("D:\\Hello.txt");
    if(file1.exists()) {
    	System.out.println("�ļ����ڣ��Ҿͽ���ɾ��");
    	file1.delete();
    }
    
    if(!file1.exists()) {
    	try {
    		System.out.println("�ļ������ڣ��Ҿ��´���һ��");
    		file1.createNewFile();
    		
    		System.out.println("����·��Ϊ��"+file1.getAbsolutePath());
    		System.out.println("�ļ���Ϊ��"+file1.getName());
    		System.out.println("��·��Ϊ��"+file1.getParent());
    		
    		file1.renameTo(new File("D:\\Hello2.txt"));
    	}catch (IOException e) {
			e.printStackTrace();
		}
    }
	}
	public  void  TextDirectory() { 
		System.out.println("JUnit�ĵ�һ������");
	
    File dirl=new File("D:\\demo");
    if(dirl.exists()) {
    	System.out.println("Ŀ¼���ڣ��Ҿͽ���ɾ��");
    	dirl.delete();
    }
    
    if(!dirl.exists()) {
    	
    	System.out.println("Ŀ¼�����ڣ��Ҿ��´���һ��");
    	dirl.mkdir();
	}
	File dir2=new File("D:\\demo\\o2\\o3\\o4");
    if(dir2.exists()) {
    	System.out.println("�༶Ŀ¼����");
    	dir2.delete();
    }
    
    if(!dir2.exists()) {
    	
    	System.out.println("�༶Ŀ¼�����ڣ��Ҿʹ�������Ŀ¼");
    	dir2.mkdirs();
	
	}
	}
}