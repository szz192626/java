package MXDX;

public class ElectronicLion {
	String color;

	public String getColor() {
		return color + "色";
	}

	public void run() {
		System.out.println("以迅雷不及掩耳盗铃之势，跑了过来");
	}

	public String bark() {
		String str = getWeight() + color + "正在狮吼";
		return str;
	}

	public int getWeight() {
		int weight = 100;
		return weight;
	}

	public static void main(String[] sa) {
		ElectronicLion el = new ElectronicLion();
		el.color = "土黄色";
		el.run();

		String str2 = el.bark();
		System.out.println(str2);// =System.out.println(el.bark);

		int weig = el.getWeight();
		System.out.println(weig + "斤");

	}

}
