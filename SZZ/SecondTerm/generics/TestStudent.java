package generics;

public class TestStudent {

	public static void main(String[] args) {
		Student<Identification>student1=new Student<>(new Identification("���֤","����      ","32052020000928442X"));
        System.out.println(student1);
        Student<StudentIdentification>student2=new Student<>(new StudentIdentification("ѧ��֤","����      ", "1902343232"));
        System.out.println(student2);
        Student<FoodCard>student3=new Student<>(new FoodCard("ѧУ����", "����       ", 800));
        System.out.println(student3);
	}

}
