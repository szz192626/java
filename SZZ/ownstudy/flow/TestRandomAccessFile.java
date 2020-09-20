package flow;

import java.io.RandomAccessFile;


public class TestRandomAccessFile {
/**
 *     以读写方式打开文件
 * @param args
 */
	public static void main(String[] args) throws Exception{
		RandomAccessFile   raf1=new RandomAccessFile("f:\\1.txt","rw");
		//保存姓名（8位字符串）和年龄( int 4): 
       String name="zhangsan";
       int age = 20;
       raf1.write(name.getBytes());
       raf1.writeInt(age);
       raf1.close();
       RandomAccessFile raf2=new RandomAccessFile("f:\\1.txt","r");
       byte b[]=new byte[8];
       raf2.read(b);
       int age2=raf2.readInt();
       System.out.println(new String(b)+"-->"+age2);
	}

}
