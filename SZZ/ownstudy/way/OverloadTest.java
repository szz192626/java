package way;

/**
 * ��������
 * 
 * @author ��̬��
 *
 */
public class OverloadTest {
//����һ���������������������
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("����������ӵĺ��ǣ�" + (a + b));
	}

//����һ���������������������
	public int add(int a, int b, int c) {
		return a + b + c;
	}

//����һ�����������������������
	public double add(double a, double b) {
		return a + b;
	}

//����һ��������һ��������С�������
	public void add(int a, double b) {
		double sum = a + b;
		System.out.println("����������ӵĺ��ǣ�" + sum);
	}

}
