package inherit;

public class Dog extends Pet {
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public Dog(){
           
		System.out.println("����Dog���޲ι��췽��");
		
	}

	public Dog(String name,int health,int love, String strain){
		//this.name=name; //����ֱ�ӷ��ʸ����private����
/*		System.out.println("����Dog���вι��췽��");
		super.setName(name);//����ͨ�������public��setter���������ʸ��������
		super.setHealth(health);
		super.setLove(love);
		this.strain=strain;*/
		
		super(name,health,love);//���������Ĵ�����Դﵽͬ����Ч��
		this.strain=strain;	
		System.out.println("����Dog���вι��췽��");
		
		
	}

	
	public void eatsomething(String food) {
		System.out.println();
		
	}
	public int Leg() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		//�Ƚϵ���this�����object�����Ƿ���ͬһ������ʵ��
		if(obj instanceof Dog) {
	        Dog dog =(Dog)obj;
	        if(this.getName().equals(dog.getName())
	        		&&this.getStrain().equals(getStrain())) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
		}else {
	        	return false;
	        }
		}	
	        
	@Override  //ע��
	public String toString() {
		
		return "�ҽ�"+this.getName()+"��һ��"+this.strain;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void catchingFlyDisc() {
		if(this.getHealth()>10) {
		System.out.println(this.getName()+"�����˸��˵����ŷ�����Ϸ");	
		this.setHealth(this.getHealth()-10);
		this.setHealth(this.getLove()+5);
		}else {
			System.out.println(this.getName()+"���ˣ���������Ϸ��ֻ��й�ͷ");
		}
	}
	
	
	
}
