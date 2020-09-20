package interfac;

public class TestTheIfPoorDoor {

	public static void main(String[] args) {
	/*	TheIfProofDoor tpf=new  TheIfProofDoor("铸成");
		tpf.close();
		tpf.lockup();
		tpf.takePicture();
		tpf.openLock();
		tpf.open();  */
   /*     TheIfProofFingerprintDoor tpfd =new TheIfProofFingerprintDoor("盼盼");
		tpfd.openbyFingerprint();
		tpfd.openLock();  */
		
	/*	Bell  bell1 =new TheIfProofFingerprintDoor("现代");
		bell1.takePicture();
		*/
		LockFingerprint  lfp=new TheIfProofFingerprintDoor("现代");
		System.out.println(lfp.standard);
		//lfp.standard ="美标"，不可以改变赋值
		System.out.println(LockFingerprint.standard);//通过接口名之间访问
	}

}
