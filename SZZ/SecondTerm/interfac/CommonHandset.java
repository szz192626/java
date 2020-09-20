package interfac;

public class CommonHandset extends Handset implements PlayWiring{
	
	public CommonHandset() {
		
	}
	
	public CommonHandset(String brand,String type) {
    	super(brand,type);
    }
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"正在播放音频");
	}

	@Override
	public void sendlnfo() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"发送信息");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"接通电话。。。");
	}

	
}
