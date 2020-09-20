package interfac;

public class UDisk implements USB{
    private  String brand;
    public UDisk() {
    	
    }
    public UDisk(String brand) {
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
		System.out.println(this.brand+"已插入。。。");
		
	}

	@Override
	public void firing() {
		System.out.println("打开"+this.brand);
		
	}

	@Override
	public void cease() {
		System.out.println("拔出"+this.brand);
		
	}
  
}
