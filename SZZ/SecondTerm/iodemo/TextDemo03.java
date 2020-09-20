package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class TextDemo03 {
	@Test
	public void copyCharFile() {
		File file1 = new File("d:\\Case\\mydir\\�ҵ��ഺ������.txt");
		File file2 = new File("d:\\Case\\mydir\\�ҵ��ഺ������2.txt");
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileReader fis = null;
		FileWriter fos = null;

		try {
			fis = new FileReader(file1);
			try {
				fos = new FileWriter(file2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		char[] chars = new char[128];
		int len = -1;
		try {
			while ((len = fis.read(chars)) != -1) {
				System.out.println(new String(chars));
				fos.write(chars, 0, len);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		if (fos != null) {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}