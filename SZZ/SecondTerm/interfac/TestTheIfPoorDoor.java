package interfac;

public class TestTheIfPoorDoor {

	public static void main(String[] args) {
	/*	TheIfProofDoor tpf=new  TheIfProofDoor("����");
		tpf.close();
		tpf.lockup();
		tpf.takePicture();
		tpf.openLock();
		tpf.open();  */
   /*     TheIfProofFingerprintDoor tpfd =new TheIfProofFingerprintDoor("����");
		tpfd.openbyFingerprint();
		tpfd.openLock();  */
		
	/*	Bell  bell1 =new TheIfProofFingerprintDoor("�ִ�");
		bell1.takePicture();
		*/
		LockFingerprint  lfp=new TheIfProofFingerprintDoor("�ִ�");
		System.out.println(lfp.standard);
		//lfp.standard ="����"�������Ըı丳ֵ
		System.out.println(LockFingerprint.standard);//ͨ���ӿ���֮�����
	}

}
