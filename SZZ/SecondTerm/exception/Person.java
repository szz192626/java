package exception;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) { 
		try {
			if(age<1||age>100) {
				throw new AgeInputException("年龄错误 ");
				
			}else {
				this.age = age;
				System.out.println("年龄："+this.age+"岁");
			}
			
		} catch (AgeInputException e) {
			// TODO: handle exception
			System.out.println("年龄超出范围");
			e.printStackTrace(); 
		}
		 finally {
			System.out.println("设置年龄过程结束");
		}
		System.out.println("感谢使用本程序！");
		
	}
	
	public class AgeInputException extends Exception {
		public AgeInputException(String message) {
			super(message);
		}
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args ) {
		Person person = new Person();
		person.setAge(154 );
		 
	}
	
}
