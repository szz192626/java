package flow;

import java.io.RandomAccessFile;


public class TestRandomAccessFile {
/**
 *     �Զ�д��ʽ���ļ�
 * @param args
 */
	public static void main(String[] args) throws Exception{
		RandomAccessFile   raf1=new RandomAccessFile("f:\\1.txt","rw");
		//����������8λ�ַ�����������( int 4): 
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
