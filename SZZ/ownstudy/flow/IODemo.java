package flow;

import java.io.File;

public class IODemo {
/**
 *    列出目录下所有文件
 * @param args
 */
	public static void main(String[] args) {
          File  f =new File("F:\\2012java\\11");
       //列出次目录下的全部文件
          //列出之前最好先判断给出的是不是一个目录
          if(f.isDirectory()) {
        	  String str[]=f.list();
        	  for(int i=0;i<str.length;i++) {
        		  System.out.println(str[i]);
        	  }
          }
          else {
        	  System.out.println("不是目录。。");   }
	}

}
