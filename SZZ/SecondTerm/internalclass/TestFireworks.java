package internalclass;

public class TestFireworks {

	public static void main(String[] args) {
		new Fireworks() {
			public void boom() {
			this.setBrand("大四方白天烟花");	
				System.out.println(this.getBrand()+"  正在以笛音雷和降落伞的形式燃放");
			}
		}.boom();
		new SetOff() {
		String brand="大四方夜晚烟花";
	        public void boom() {
	        	System.out.println("-------------------------------");
			System.out.println(this.brand+"  正在以打在高空炸成彩花似的燃放");
			}
		}.boom();
	}

}
