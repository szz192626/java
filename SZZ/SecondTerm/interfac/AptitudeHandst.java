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
		System.out.println(getBrand()+"�Ѿ��ɹ�����5G����");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"���ڲ���MV");
	}

	@Override
	public void takePictare() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"���չ����Ѿ���");
	}

	@Override
	public void sendlnfo() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"������Ϣ������");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"ͨ��绰������");
	}

}
