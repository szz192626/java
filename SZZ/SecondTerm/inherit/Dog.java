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
           
		System.out.println("子类Dog的无参构造方法");
		
	}

	public Dog(String name,int health,int love, String strain){
		//this.name=name; //不能直接访问父类的private属性
/*		System.out.println("子类Dog的有参构造方法");
		super.setName(name);//可以通过父类的public的setter方法来访问父类的属性
		super.setHealth(health);
		super.setLove(love);
		this.strain=strain;*/
		
		super(name,health,love);//这个和上面的代码可以达到同样的效果
		this.strain=strain;	
		System.out.println("子类Dog的有参构造方法");
		
		
	}

	
	public void eatsomething(String food) {
		System.out.println();
		
	}
	public int Leg() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		//比较的是this对象和object对象是否是同一个物理实体
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
	        
	@Override  //注解
	public String toString() {
		
		return "我叫"+this.getName()+"是一条"+this.strain;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void catchingFlyDisc() {
		if(this.getHealth()>10) {
		System.out.println(this.getName()+"和主人高兴的玩着飞盘游戏");	
		this.setHealth(this.getHealth()-10);
		this.setHealth(this.getLove()+5);
		}else {
			System.out.println(this.getName()+"饿了，不想玩游戏，只想啃骨头");
		}
	}
	
	
	
}
