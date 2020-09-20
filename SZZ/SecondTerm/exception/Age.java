package exception;

public class Age {
     private int  age;
     public int getAge() {
    	 return age;
     }
     public void setAge(int age)throws Exception{
    	 if(age>=1&&age<=100) {
    		 this.age=age;
    	 }else {
    		 throw new AgeInputException("·¶Î§´íÎó");
    	 }
    	 
     }
     
     public class AgeInputException extends Exception{
    	 public AgeInputException(String message) {
    		 super(message);
    	 }
     }
}
