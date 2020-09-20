package internalclass;

public class TestAnonymousClass {

	public static void main(String[] args) {
		new Phone() {
			public void netbrowering() {
				this.setBrand("小米手机");
				System.out.println(this.getBrand()+" 正在上网，浏览学校网站");
			}
		}.netbrowering();
		new Network() {
			String brand ="华为";
			@Override
			public void netbrowering() {
				// TODO Auto-generated method stub
				System.out.println(this.brand+"正在愉快的上网");
			}
		}.netbrowering();
	}
	}

