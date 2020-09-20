package exception;

public class Test {
	public static void main(String[] args ) {
		Age age=new Age();
		try {
			age.setAge(189);
			
		}catch(Exception e) {
			System.out.println("年龄范围出现异常，已被捕获！");
		}finally {
			System.out.println("程序结束！");
		}
		}
}
