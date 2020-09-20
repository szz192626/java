package entity;

public class Student {
	private int id;
    private String name;
    private int class1;
    private int studynum;
    
    public Student(){
 	   
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getClass1() {
		return class1;
	}

	public void setClass1(int class1) {
		this.class1 = class1;
	}

	public int getStudynum() {
		return studynum;
	}

	public void setStudynum(int studynum) {
		this.studynum = studynum;
	}
   public String toString() {
 	return "["+this.id+","+this.name+","+
     this.class1+","+this.studynum+"]";
 }
    
    
}
