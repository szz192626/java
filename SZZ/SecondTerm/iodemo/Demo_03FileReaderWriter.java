package iodemo;
/**
 * �����ַ���
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.NotYetBoundException;

import org.junit.Test;

public class Demo_03FileReaderWriter {

	@Test
	public  void TestReader() {

		
//		File file1=new File("d:\\demo\\o2.txt");
		File file1=new File("d:"+File.separator+"Case"+
                             File.separator+"helloword5.txt");
//		����һ���ļ������ַ���,����Դ�ļ��洢ʱʹ�õ��ַ����뷽ʽ��أ���
//		FileReader  ISO-XXXX-1���루��ANSI���ݣ�
		
		FileReader fr=null;
		try {
			fr=new FileReader(file1);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		��ʼ���ļ�
		char[] chars=new char[30];
		int len=-1;
		

		try {
			while((len=fr.read(chars))!=-1) {
			 System.out.println("���ζ���"+len+"���ַ�");
			 
//			 ����ļ���UTF-8����ģ���ô����Ҫת��
			 
			 String str=new String(chars);
			 byte[] bytes=str.getBytes();
			 str=new String(bytes,"UTF-8");
			 System.out.println("ת����ĺ�������Ϊ��"+str);
			 
			 
			 
			 for(int i=0;i<len;i++) {
				 System.out.println(chars[i]+"  ");
			 }
			 System.out.println("");
//		     System.out.println(new String(bytes,0,end));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
//		����Ӧ�����ر�
		if(fr!=null) {
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	
	/**
	 * �ļ������
	 */
	
	
	@Test
	public void TestWriter() {
		File file1=new File("d:"+File.separator+"Case"+
	           File.separator+"helloword6");
		if(!file1.exists()) {
			try {
			file1.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
//		���������
		
		
		FileWriter fw=null;
		
			try {
				fw=new FileWriter(file1);//new FileWriter(file1,true)���������ӵ��ļ������
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
//		byte[] bytes=new byte[] {'i','j','k','l'};
		char[] chars=null;
		chars="����һ��ѧ�������ֽ�������".toCharArray();
		try {
            fw.write(chars);
			System.out.println("�ղ���������:   "+new String(chars));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(fw!=null) {
			try {
				fw.close();
			}catch (IOException e) {
				// TODO: handle exception
	             e.printStackTrace(); 			
				
			}
		}
		
}
	
	@Test
	public void copyCharFile() {
//		���ַ��������ֽ��ļ������ֽ�Ϊ��λ��֯���ļ������޷�ʵ�ֿ����ģ���ֻ�ܴ����ı��ļ�
//		File file1 =new File("d:\\demo\\video.mp4");
//		File file2=new File("d:\\demo\\videocopyed.mp4");
		File file1 =new File("d:\\Case\\file1.txt");
		File file2=new File("d:\\Case\\file2.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		FileReader fis=null;
		FileWriter fos=null;
		
		try {
			 fis=new FileReader(file1);
			 try {
				fos=new FileWriter(file2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
/**
 * һ���Ƕ���һ����д
 */
		char[] chars=new char[128];
		int len=-1;
		try {
			while((len=fis.read(chars))!=-1) {
				System.out.println(new String(chars));
				fos.write(chars,0,len);
			}
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(fis!=null) {
			try {
				fis.close();
			}catch (IOException e) {

				e.printStackTrace();
			}
		}
		if(fos!=null) {
			try {
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
}