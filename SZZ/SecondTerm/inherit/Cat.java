package inherit;

public class Cat extends Pet {
	
	public Cat() {
		
	}
	
	public Cat(String name,int Health,int Love) {
		super(name,Health,Love);
	}
	public void catchCat() {
		if(this.getHealth()>60) {
			System.out.println(this.getName()+"��Ū��è��������");
			this.setHealth(this.getHealth()-3);
			this.setLove(this.getLove()+2);
		}else {
			System.out.println(this.getName()+"���ˣ�ֻ��ſ�ţ��治��");
		}
		
		
	}
	public void eatSomething(String food) {
		if(this.getHealth()!=100){
			
			   this.setHealth(this.getHealth()+4<=100?this.getHealth()+4:100);
			   System.out.println(this.getName()+"����"+food);
	    }
		else {
				  System.out.println(this.getName()+"�Ѿ����ˣ��Ժ���ι");
			  }
	}
}
