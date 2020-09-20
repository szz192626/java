package swingdemo;

public class Phone {
	private String brand;
	private int price;

	public Phone() {
	}
    public Phone(String brand) {
    	this.brand=brand;
    	this.price=1000;
    }
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    public String toString() {
    	return  this.brand+"���ֻ�,�۸�"+this.price;
    }
}
