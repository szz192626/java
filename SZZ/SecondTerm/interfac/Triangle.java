package interfac;

public class Triangle implements Display{
	private  String name;
    public Triangle() {
    	
    }
	public Triangle(String name) {
		this.name=name;
	}
	public void show() {
		System.out.println("��ʾ"+this.name);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
