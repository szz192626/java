package MXDX;

public class ElectronicLion {
	String color;

	public String getColor() {
		return color + "ɫ";
	}

	public void run() {
		System.out.println("��Ѹ�ײ����ڶ�����֮�ƣ����˹���");
	}

	public String bark() {
		String str = getWeight() + color + "����ʨ��";
		return str;
	}

	public int getWeight() {
		int weight = 100;
		return weight;
	}

	public static void main(String[] sa) {
		ElectronicLion el = new ElectronicLion();
		el.color = "����ɫ";
		el.run();

		String str2 = el.bark();
		System.out.println(str2);// =System.out.println(el.bark);

		int weig = el.getWeight();
		System.out.println(weig + "��");

	}

}
