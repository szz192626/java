package internalclass;

public class TestFireworks {

	public static void main(String[] args) {
		new Fireworks() {
			public void boom() {
			this.setBrand("���ķ������̻�");	
				System.out.println(this.getBrand()+"  �����Ե����׺ͽ���ɡ����ʽȼ��");
			}
		}.boom();
		new SetOff() {
		String brand="���ķ�ҹ���̻�";
	        public void boom() {
	        	System.out.println("-------------------------------");
			System.out.println(this.brand+"  �����Դ��ڸ߿�ը�ɲʻ��Ƶ�ȼ��");
			}
		}.boom();
	}

}
