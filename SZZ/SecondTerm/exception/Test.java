package exception;

public class Test {
	public static void main(String[] args ) {
		Age age=new Age();
		try {
			age.setAge(189);
			
		}catch(Exception e) {
			System.out.println("���䷶Χ�����쳣���ѱ�����");
		}finally {
			System.out.println("���������");
		}
		}
}
