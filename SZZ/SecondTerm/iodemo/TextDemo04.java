package iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TextDemo04 {

	@Test
	public void copyByteFile() {

		File file1 = new File("d:\\Case\\mydir\\video.mp4");
		File file2 = new File("c:\\myFile\\mydir\\video1.mp4");
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(file1);

			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(file2);

			bos = new BufferedOutputStream(fos);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		long begin = System.currentTimeMillis();

		byte[] bytes = new byte[1024];
		int len = -1;
		try {
			while ((len = bis.read(bytes)) != -1) {
				bos.write(bytes, 0, len);
			}
			bos.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("øΩ±¥π≤”√ ±£∫" + (end - begin) + "∫¡√Î");

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
		if (bis != null) {
			try {
				bis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		if (bos != null) {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
