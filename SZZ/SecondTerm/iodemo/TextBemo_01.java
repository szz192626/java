package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TextBemo_01 {

	@Test
	public void TestFile() {
		File dir1 = new File("D:\\Case\\myDir");
		if (dir1.exists()) {
			System.out.println("多级目录存在");
		}
		if (!dir1.exists()) {
			System.out.println("多级目录不存在，创建整个目录结构");
			dir1.mkdirs();
		}
		File dir2 = new File("D:\\Case\\myDir\\我的青春我做主.txt");
		if (!dir2.exists()) {
			System.out.println("文件不存在，新创建一个");
			try {
				dir2.createNewFile();
				System.out.println("绝对路径为：" + dir2.getAbsolutePath());
				System.out.println("路径为：" + dir2.getName());
				System.out.println("父路径为：" + dir2.getParent());
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		if (dir2.exists()) {
			System.out.println("如果文件存在，我将其删除");
			dir2.delete();
		}

	}

}
