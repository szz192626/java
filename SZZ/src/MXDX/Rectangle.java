package MXDX;

public class Rectangle {
	double edgeNum;
	double wideNum;

	public void printarea() {
		double area = edgeNum * wideNum;
		System.out.println("长为："+edgeNum+"m");
		System.out.println("宽为："+wideNum+"m");
		System.out.println("该长方形的面积为：" + area+"㎡");

	}

}
