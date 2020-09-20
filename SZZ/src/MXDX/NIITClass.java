package MXDX;

public class NIITClass {
//属性，fields
	String  name;
	int     studentNum;
	String major;
	String BZR;
	String BZ;
	
	//方法，行为
	public void printInfo() {
		System.out.println("-------");
		System.out.println("班级名称："+name);
		System.out.println("班级人数："+studentNum);
		System.out.println("专业名称："+major);
		System.out.println("班主任："+BZR);
		System.out.println("班长："+BZ);
	}
	
	
}
