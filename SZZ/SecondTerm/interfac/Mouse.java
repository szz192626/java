package interfac;

public class Mouse implements USB{
    private String brand;
    public Mouse() {
    	
    }
    public Mouse(String brand) {
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
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("检测到"+this.brand+"已插入");
	}

	@Override
	public void firing() {
		// TODO Auto-generated method stub
		System.out.println("可以使用。。。");
	}

	@Override
	public void cease() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"已拔出");
	}

}
