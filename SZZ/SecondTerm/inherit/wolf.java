package inherit;

public class wolf extends Animal {
	
	   public wolf() { 
		   
	   }
	   public wolf(String name) {
		   super(name);
	   }
	
       public void run() {
    	   System.out.println("------------------");
    	   System.out.println(this.getName()+"���ڼ���׷��");
       }
	 public void eatSomething(String food) {
		 System.out.println(getName()+"ֻ���"+food);
	 }
	
	
	
	
	
	
	
}
