package interfac;

public class TheIfProofDoor extends Door implements Lock,Bell{
       public  TheIfProofDoor() {
    	   
       }
       public TheIfProofDoor(String brand) {
    	   super(brand);
       }
	@Override
	public void lockup() {
		
		System.out.println(this.getBrand()+"������");
	}

	@Override
	public void openLock() {
		
		System.out.println(this.getBrand()+"������");
	}

	@Override
	public void open() {
		
		System.out.println(this.getBrand()+"�ſ���");
	}

	@Override
	public void close() {
		
		System.out.println(this.getBrand()+"�Ź���");
	}
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"�������ˣ��Խ����գ��������");
	}

	

}
