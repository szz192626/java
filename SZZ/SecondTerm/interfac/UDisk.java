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
		System.out.println(this.brand+"�Ѳ��롣����");
		
	}

	@Override
	public void firing() {
		System.out.println("��"+this.brand);
		
	}

	@Override
	public void cease() {
		System.out.println("�γ�"+this.brand);
		
	}
  
}
