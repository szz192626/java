package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TextDemo02 {

	@Test
	public void copyByte() {
		File file1 = new File("d:\\Case\\mydir\\H5-3.jpg");
		File file2 = new File("d:\\Case\\myFile\\H5-3copyed.jpg");
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		byte[] bytes = new byte[1024];
		int len = -1;
		try {
			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
