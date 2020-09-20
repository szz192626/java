package interfac;

public class Triangle2 implements MultilateralFunctions{
    private  String name;
    private  double land1high;
    private  double land1;
    private  double land2;
    private  double land3;
    public  Triangle2() {
		
	}
    public Triangle2(String name,double land1high,double land1,double land2,double land3) {
    this.name=name;
    this.land1high=land1high;
    this.land1=land1;
    this.land2=land2;
    this.land3=land3;
    }
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------");
		System.out.println(this.name+"的面积："+land1high*land1);
	}

	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"的周长："+ (land1+land2+land3));
	}
      
}
