package interfac;

public class TheIfProofDoor extends Door implements Lock,Bell{
       public  TheIfProofDoor() {
    	   
       }
       public TheIfProofDoor(String brand) {
    	   super(brand);
       }
	@Override
	public void lockup() {
		
		System.out.println(this.getBrand()+"上锁了");
	}

	@Override
	public void openLock() {
		
		System.out.println(this.getBrand()+"锁开了");
	}

	@Override
	public void open() {
		
		System.out.println(this.getBrand()+"门开了");
	}

	@Override
	public void close() {
		
		System.out.println(this.getBrand()+"门关了");
	}
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"门铃响了，对焦拍照，拍照完成");
	}

	

}
