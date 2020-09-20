package encolope;

public class TestEmployee {

	public static void main(String[] args) {
		Employee2 employee2=new Employee2("·½·½",25,"Å®",8000);
        employee2.print();
        employee2.printcomeFullYear();
        Manager manager=new Manager("ÁúÌÚ",26,"ÄÐ",10000,0.4,20000);
        manager.print();
        manager.printcomeFullYear();
        
	}

}
