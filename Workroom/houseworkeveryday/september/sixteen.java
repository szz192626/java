package september;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class sixteen {
        public static void main(String[] args) throws IOException {
        	List<Integer>list = new ArrayList<Integer>();
        	for(int i=0;i<=100;i++) {
        		int temp=(int)(Math.random()*100);
        		list.add(temp);
        	}
        	File file =new File("D:/sixteen.txt");
        	if(!file.exists()) {
        		System.out.println("正在创建文件");
        	try {
        		file.createNewFile();
        		
        	}catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.println("创建成功！");
        }else {
        	FileWriter fileWriter=new FileWriter(file);
        	fileWriter.write(String.valueOf(list)+"\t" );
        	fileWriter.close();
        	System.out.println("已经写入本地文件。。。");
        }
}
}