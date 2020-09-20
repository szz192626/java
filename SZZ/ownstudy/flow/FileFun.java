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
			System.out.println("磁盘错误！");
			System.out.println("文件名是："+f.getName());
			System.out.println("文件路径是："+f.getPath());
			System.out.println("文件绝对路径是："+f.getAbsolutePath());
			System.out.println("文件是否存在："+(f.exists()?"存在":"不存在"));
			System.out.println("文件是否可读："+(f.canRead()?"可读":"不可读"));
			System.out.println("文件是否是目录："+(f.isDirectory()?"是目录":"不是目录"));
			System.out.println("文件最后修改时间"+new Date(f.lastModified()));
		}
	}

}
