package iodemo;
/**
 * 输入字节流
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Demo02_FlieInputOutputStream {

	@Test
	public  void TestFileInputStream() {

		
//		File file1=new File("d:\\demo\\o2.txt");
		File file1=new File("d:"+File.separator+"demo"+
                             File.separator+"o2.txt");
//		创建一个文件输入字节流
//		本就存在，读取内容
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file1);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		开始读文件
		byte[] bytes=new byte[6];
		int len=-1;
		
//		do {
//			try {
//			end=fis.read(bytes);
//			System.out.println("本次读出"+end+"个字节");
//			if(end==-1) {
//				break;
//			}
//			System.out.println(new String(bytes,0,end));
//			}catch(IOException e) {
//			e.printStackTrace();	
//			}
//			
//		}while(end!=-1);
		try {
			while((len=fis.read(bytes))!=-1) {
			 System.out.println("本次读出"+len+"个字节");
			 for(int i=0;i<len;i++) {
				 System.out.println(bytes[i]+"  ");
			 }
			 System.out.println("");
//		     System.out.println(new String(bytes,0,end));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
//		将对应的流关闭
		if(fis!=null) {
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	
	/**
	 * 文件输出流
	 */
//	本不存在，创建一个，写入内容
	
	@Test
	public void TestFileOutputSteam() {
		File file1=new File("d:"+File.separator+"demo"+
	           File.separator+"o3");
		if(!file1.exists()) {
			try {
			file1.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file1,true);
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		byte[] bytes=new byte[] {'i','j','k','l'};
		byte[] bytes=null;
		bytes="abcdefjhijklmn".getBytes();
		try {
//			fos.write(98);//写的是ASCII为98的字符，也就是‘b'
			fos.write(bytes,5,5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(fos!=null) {
			try {
				fos.close();
			}catch (IOException e) {
				// TODO: handle exception
	             e.printStackTrace(); 			
				
			}
		}
		
}
//	用代码实现拷贝功能
	@Test
	public void copyByteFile() {
		File file1 =new File("d:\\demo\\video.mp4");
		File file2=new File("d:\\demo\\videocopyed.mp4");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			 fis=new FileInputStream(file1);
			 fos=new FileOutputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
/**
 * 一个是读，一个是写
 */
		byte[] bytes=new byte[1024];
		int len=-1;
		try {
			while((len=fis.read(bytes))!=-1) {
				fos.write(bytes,0,len);
			}
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
}
