package interfac;


public class TestUSB {

	public static void main(String[] args) {
		USB usb1=new UDisk("U��");
		usb1.insert();
        usb1.firing();
        usb1.cease();
        USB usb2=new MobileHardDiskDrive("�ƶ��ӿ�");
        usb2.insert();
        usb2.firing();
        usb2.cease();
        USB usb3=new Mouse("���");
        usb3.insert();
        usb3.firing();
        usb3.cease();
	}

}
