package interfac;

public class CommonHandset extends Handset implements PlayWiring{
	
	public CommonHandset() {
		
	}
	
	public CommonHandset(String brand,String type) {
    	super(brand,type);
    }
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"���ڲ�����Ƶ");
	}

	@Override
	public void sendlnfo() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"������Ϣ");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"��ͨ�绰������");
	}

	
}
