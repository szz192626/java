package internalclass;

public class TestAnonymousClass {

	public static void main(String[] args) {
		new Phone() {
			public void netbrowering() {
				this.setBrand("С���ֻ�");
				System.out.println(this.getBrand()+" �������������ѧУ��վ");
			}
		}.netbrowering();
		new Network() {
			String brand ="��Ϊ";
			@Override
			public void netbrowering() {
				// TODO Auto-generated method stub
				System.out.println(this.brand+"������������");
			}
		}.netbrowering();
	}
	}

