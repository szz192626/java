package flow;

import java.io.File;
import java.util.*;
public class FileFun {

	public static void main(String[] args) {
		File f =new File("1.txt");
		try {
			f.createNewFile();
		}
          catch (Exception e) {
			System.out.println("���̴���");
			System.out.println("�ļ����ǣ�"+f.getName());
			System.out.println("�ļ�·���ǣ�"+f.getPath());
			System.out.println("�ļ�����·���ǣ�"+f.getAbsolutePath());
			System.out.println("�ļ��Ƿ���ڣ�"+(f.exists()?"����":"������"));
			System.out.println("�ļ��Ƿ�ɶ���"+(f.canRead()?"�ɶ�":"���ɶ�"));
			System.out.println("�ļ��Ƿ���Ŀ¼��"+(f.isDirectory()?"��Ŀ¼":"����Ŀ¼"));
			System.out.println("�ļ�����޸�ʱ��"+new Date(f.lastModified()));
		}
	}

}
