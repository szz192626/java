package homework;
/**
 *     ��ά��ɫ��ӡ��
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
    	System.out.println(this.getName()+"����ʹ���С�����");
		System.out.println(this.getName()+"������ά��ӡ����ɫֽ");
		System.out.println("------------");
		
	}
	
	
}
