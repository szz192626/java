package MXDX;

public class Phone {

	
	public void  playMusic() {
		System.out.println("�ֻ����ڲ�������");
	}
	public String downloadMusic() {
		String songname="���տ���";
		System.out.println("�ֻ���������"+songname);
		return songname;
	}
	public void charge() {
		Battery battery=new Battery();
		battery.brand="Apple";
		battery.getpower();
	}
	
	
	
	
	
	
	
}
