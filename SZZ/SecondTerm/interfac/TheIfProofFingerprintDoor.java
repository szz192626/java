package interfac;

public class TheIfProofFingerprintDoor extends Door implements LockFingerprint,Bell{
    public  TheIfProofFingerprintDoor() {
		
	}

   public TheIfProofFingerprintDoor(String brand) {
	   super(brand);
}
	
	
	@Override
	public void lockup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"����Կ�׺�������");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("��⵽��������ǰ����������");
	}

	@Override
	public void openbyFingerprint() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"������ȷָ�ƺ�������");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	

}