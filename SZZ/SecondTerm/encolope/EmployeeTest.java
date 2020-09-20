package encolope;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee("张三","男",3000);
		emp1.printEmployee();
		Employee emp2=new Employee("李四");
		emp2.setGender("女");
		emp2.setSalary(111);
		emp2.printEmployee();

	}

}
