package inherit;

public class wolf extends Animal {
	
	   public wolf() { 
		   
	   }
	   public wolf(String name) {
		   super(name);
	   }
	
       public void run() {
    	   System.out.println("------------------");
    	   System.out.println(this.getName()+"正在极力追赶");
       }
	 public void eatSomething(String food) {
		 System.out.println(getName()+"只想吃"+food);
	 }
	
	
	
	
	
	
	
}
