package interfac;

public class AptitudeHandst extends Handset implements PlayWiring,TheakePictures,Network {
    public AptitudeHandst() {
		
	}
    public AptitudeHandst(String brand,String type) {
    	super(brand,type);
    }
	@Override
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"已经成功连接5G网络");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"正在播放MV");
	}

	@Override
	public void takePictare() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"拍照功能已就绪");
	}

	@Override
	public void sendlnfo() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"发送信息。。。");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"通入电话。。。");
	}

}
