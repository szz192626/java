package generics;

public class Identification extends Student{
	private String name;
	private String identificatenum;
	public Identification() {
		
	}
	public Identification(String userid,String name,String identificatenum) {
		super(userid);
		this.name=name;
		this.identificatenum=identificatenum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentificatenum() {
		return identificatenum;
	}
	public void setIdentificatenum(String identificatenum) {
		this.identificatenum = identificatenum;
	}
	public String toString() {
		return "姓名:"+name+"身份证号："+identificatenum;
	}

}
