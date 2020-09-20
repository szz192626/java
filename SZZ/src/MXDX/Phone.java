package MXDX;

public class Phone {

	
	public void  playMusic() {
		System.out.println("手机正在播放音乐");
	}
	public String downloadMusic() {
		String songname="生日快乐";
		System.out.println("手机正在下载"+songname);
		return songname;
	}
	public void charge() {
		Battery battery=new Battery();
		battery.brand="Apple";
		battery.getpower();
	}
	
	
	
	
	
	
	
}
