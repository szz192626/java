package encolope;

public class TestEmployee {

	public static void main(String[] args) {
		Employee2 employee2=new Employee2("����",25,"Ů",8000);
        employee2.print();
        employee2.printcomeFullYear();
        Manager manager=new Manager("����",26,"��",10000,0.4,20000);
        manager.print();
        manager.printcomeFullYear();
        
	}

}
