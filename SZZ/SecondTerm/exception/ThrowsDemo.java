package exception;

public class ThrowsDemo {

	public static void getData() throws NumberFormatException{
		throw new NumberFormatException();
		//��ʽ����ȷ�ϱ��쳣
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
