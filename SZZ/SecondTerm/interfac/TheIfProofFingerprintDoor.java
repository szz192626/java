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
		System.out.println(this.getBrand()+"插入钥匙后，锁开了");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("检测到有人在门前，就先拍照");
	}

	@Override
	public void openbyFingerprint() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"按上正确指纹后，锁开了");
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
