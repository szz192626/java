package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MapPropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
//		本地文件
		properties.load(new FileInputStream(new File("d:/study/properties")));
        String user=properties.getProperty("user");
        System.out.println(user);
        String password=properties.getProperty("password");
        System.out.println(password);
        
        properties.setProperty("user", "wangermazi");
        properties.setProperty("alias", "wanger");
        properties.list(System.out);
//        往文件里读：Fileinput
        
//        properties.store(new FileOutputStream(new File(c:/txt)), );
        
        
	}

}
