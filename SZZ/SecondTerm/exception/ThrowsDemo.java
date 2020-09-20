package exception;

public class ThrowsDemo {

	public static void getData() throws NumberFormatException{
		throw new NumberFormatException();
		//格式不正确上报异常
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 getData();
     }catch (Exception e) {
		// TODO: handle exception
    	 System.out.println(e);
	}
     
	}

}
