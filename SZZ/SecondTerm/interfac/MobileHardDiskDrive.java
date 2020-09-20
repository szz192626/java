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
		System.out.println("已检测到有   "+this.brand+"  插入，是否使用。。。。。");
		
	}

	@Override
	public void firing() {
		System.out.println("启动   "+this.brand+"  操作。。。");
		
	}

	@Override
	public void cease() {
		System.out.println("已停止使用该   "+this.brand+"  。。。");
		
	}

	 
	
	
}
