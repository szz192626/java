package iodemo;
/**
 * �����ֽ���
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
//		����һ���ļ������ֽ���
//		���ʹ��ڣ���ȡ����
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file1);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		��ʼ���ļ�
		byte[] bytes=new byte[6];
		int len=-1;
		
//		do {
//			try {
//			end=fis.read(bytes);
//			System.out.println("���ζ���"+end+"���ֽ�");
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
			 System.out.println("���ζ���"+len+"���ֽ�");
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
		
		
//		����Ӧ�����ر�
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
	 * �ļ������
	 */
//	�������ڣ�����һ����д������
	
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
//			fos.write(98);//д����ASCIIΪ98���ַ���Ҳ���ǡ�b'
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
//	�ô���ʵ�ֿ�������
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
 * һ���Ƕ���һ����д
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