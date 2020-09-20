package interfac;

public class Square implements MultilateralFunctions{
    private double  length;
    private String name;
    public Square() {
    	
    }
    public Square(double length,String name) {
    	this.length=length;
    	this.name=name;
    }
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void area() {
		System.out.println("------------------------------");
		System.out.println(this.name+"面积：  "+length*length);
		
	}

	@Override
	public void girth() {
		System.out.println(this.name+"周长：  "+4*length);
	}

}
