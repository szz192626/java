package stringdemo;

public class DMZY1 {

	public static void main(String[] args) {
		String str = "321322200111220987";
		String year = str.substring(6, 10);
		String month = str.substring(10, 12);
		String day = str.substring(12, 14);
System.out.println("�����֤�ŵĳ���������Ϊ��" + year + "��" + month + "��" + day + "��");

	}

}
