package interfac;

public class MobileHardDiskDrive implements USB{
    private  String brand;
    public MobileHardDiskDrive() {
    	
    }
    public MobileHardDiskDrive(String brand) {
    	this.brand=brand;
    }
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void insert() {
		System.out.println("------------------------");
		System.out.println("�Ѽ�⵽��   "+this.brand+"  ���룬�Ƿ�ʹ�á���������");
		
	}

	@Override
	public void firing() {
		System.out.println("����   "+this.brand+"  ����������");
		
	}

	@Override
	public void cease() {
		System.out.println("��ֹͣʹ�ø�   "+this.brand+"  ������");
		
	}

	 
	
	
}