package interfac;


public class TestUSB {

	public static void main(String[] args) {
		USB usb1=new UDisk("U盘");
		usb1.insert();
        usb1.firing();
        usb1.cease();
        USB usb2=new MobileHardDiskDrive("移动接口");
        usb2.insert();
        usb2.firing();
        usb2.cease();
        USB usb3=new Mouse("鼠标");
        usb3.insert();
        usb3.firing();
        usb3.cease();
	}

}
