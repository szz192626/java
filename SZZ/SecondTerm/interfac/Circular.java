package interfac;

public class Circular implements MultilateralFunctions{
    private double  radius;
    private String name;
    public Circular() {
    	
    }
    public Circular(double radius,String name) {
    	this.radius=radius;
    	this.name=name;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------");
		System.out.println(this.name+"面积为："+Math.PI*radius*radius);
	}

	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"周长为："+2*Math.PI*radius);
	}
       
}
