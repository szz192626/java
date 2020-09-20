package exception;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) { 
		try {
			if(age<1||age>100) {
				throw new AgeInputException("������� ");
				
			}else {
				this.age = age;
				System.out.println("���䣺"+this.age+"��");
			}
			
		} catch (AgeInputException e) {
			// TODO: handle exception
			System.out.println("���䳬����Χ");
			e.printStackTrace(); 
		}
		 finally {
			System.out.println("����������̽���");
		}
		System.out.println("��лʹ�ñ�����");
		
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
