package homework;

public class User {
    private String name;
    private String  phonenumber;
	public User() {
		
	}
	public User(String name,String  phonenumber) {
		this.name=name;
		this.phonenumber=phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String  phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User user=(User)obj;
			if(this.getPhonenumber().equals(user.getPhonenumber())) {
				return true;
		
			}else {
				return false;
			}
		}else {	
			return false;
		}
		
	}
	@Override
	public String toString() {
	
		return "ĞÕÃû:"+this.name+"      ÊÖ»úºÅÂë£º"+this.phonenumber;
				}
	
	
}
