package interfac;

public class Triangle implements Display{
	private  String name;
    public Triangle() {
    	
    }
	public Triangle(String name) {
		this.name=name;
	}
	public void show() {
		System.out.println("œ‘ æ"+this.name);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
