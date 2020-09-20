package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class Demo01_File {

	
	
	@Test  //JUnit包，方便java代码测试
	public  void  TextFile() { 
		System.out.println("JUnit的第一个测试");
	
    File file1=new File("D:\\Hello.txt");
    if(file1.exists()) {
    	System.out.println("文件存在，我就将其删掉");
    	file1.delete();
    }
    
    if(!file1.exists()) {
    	try {
    		System.out.println("文件不存在，我就新创建一个");
    		file1.createNewFile();
    		
    		System.out.println("绝对路径为："+file1.getAbsolutePath());
    		System.out.println("文件名为："+file1.getName());
    		System.out.println("父路径为："+file1.getParent());
    		
    		file1.renameTo(new File("D:\\Hello2.txt"));
    	}catch (IOException e) {
			e.printStackTrace();
		}
    }
	}
	public  void  TextDirectory() { 
		System.out.println("JUnit的第一个测试");
	
    File dirl=new File("D:\\demo");
    if(dirl.exists()) {
    	System.out.println("目录存在，我就将其删掉");
    	dirl.delete();
    }
    
    if(!dirl.exists()) {
    	
    	System.out.println("目录不存在，我就新创建一个");
    	dirl.mkdir();
	}
	File dir2=new File("D:\\demo\\o2\\o3\\o4");
    if(dir2.exists()) {
    	System.out.println("多级目录存在");
    	dir2.delete();
    }
    
    if(!dir2.exists()) {
    	
    	System.out.println("多级目录不存在，我就创建整个目录");
    	dir2.mkdirs();
	
	}
	}
}