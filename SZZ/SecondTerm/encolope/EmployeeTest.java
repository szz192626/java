package encolope;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee("����","��",3000);
		emp1.printEmployee();
		Employee emp2=new Employee("����");
		emp2.setGender("Ů");
		emp2.setSalary(111);
		emp2.printEmployee();

	}

}
