package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TextBemo_01 {

	@Test
	public void TestFile() {
		File dir1 = new File("D:\\Case\\myDir");
		if (dir1.exists()) {
			System.out.println("�༶Ŀ¼����");
		}
		if (!dir1.exists()) {
			System.out.println("�༶Ŀ¼�����ڣ���������Ŀ¼�ṹ");
			dir1.mkdirs();
		}
		File dir2 = new File("D:\\Case\\myDir\\�ҵ��ഺ������.txt");
		if (!dir2.exists()) {
			System.out.println("�ļ������ڣ��´���һ��");
			try {
				dir2.createNewFile();
				System.out.println("����·��Ϊ��" + dir2.getAbsolutePath());
				System.out.println("·��Ϊ��" + dir2.getName());
				System.out.println("��·��Ϊ��" + dir2.getParent());
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		if (dir2.exists()) {
			System.out.println("����ļ����ڣ��ҽ���ɾ��");
			dir2.delete();
		}

	}

}