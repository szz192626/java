package generics;

public class Student<T> {
     private T userid;
    
     public Student() { 
    	 
     }
     public Student(T userid) {
    	 this.userid=userid;
     }
	 public T getUserID() {
		return userid;
	}

	public void setUserID(T userid) {
		this.userid = userid;
	}
    public String toString() {
    	return "װ����  "+this.userid+" ����Ϣ��ʶ";
    }
     
}
