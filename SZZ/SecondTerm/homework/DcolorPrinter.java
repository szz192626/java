package homework;
/**
 *     三维彩色打印机
 * 
 *
 */
public class DcolorPrinter extends Printer{

	
	
    public  DcolorPrinter() {
    	
    }
	public DcolorPrinter(String name) {
		super(name);
	}
    public void print() {
    	System.out.println(this.getName()+"正在使用中。。。");
		System.out.println(this.getName()+"可以三维打印出彩色纸");
		System.out.println("------------");
		
	}
	
	
}
