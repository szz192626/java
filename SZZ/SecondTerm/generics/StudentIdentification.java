package generics;

public class StudentIdentification extends Student{
     private String name;
     private String studynum;
	 public StudentIdentification() {
		 
	 }
	 public StudentIdentification(String userid,String name,String studynum) {
		 super(userid);
		 this.name=name;
		 this.studynum=studynum;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudynum() {
		return studynum;
	}
	public void setStudynum(String studynum) {
		this.studynum = studynum;
	}
	public String toString() {
		return "ĞÕÃû£º"+name+" Ñ§ºÅ£º"+studynum;
	}
}
