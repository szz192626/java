package inherit;

import inherit.Dog;
import inherit.Penguin;

public class Master {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Master() {
		
	}

	public Master(String name) {
		super();
		this.name = name;
	}
	
	/*public void feed(Penguin peg, String food) {
	    peg.eatSomething(food);
		
	}
	public void feed(Dog dog,String food) {
		dog.eatSomrthing(food);
		
	}*/
	public void playWith(Pet pet) {
		 if(pet instanceof Cat) {
		    	Cat cat =(Cat)pet;
		    	cat.catchCat();
		    }else {
		    	System.out.println(this.getName()+"û�Ա�");
		    }
	}
	public void feed(Pet pet,String food) {
	/*	System.out.println(this.getName()+"ι��");
		pet.eatSomething(food);
		pet.print();*/
	   
	    pet.print();
	}
	
	public Pet getPet(String typeID) {
		if("è".equals(typeID)) {
		return new Cat("�̲�", 88, 92);
		}else {
		System.out.println("�������ɹ�");	
		return new Dog("����", 66, 55, "�»�");
	
		}
	/*	if("��".equals(typeID)) {
			return new Dog("����",88,66,"��ʿ��");
		}
		else if("���".equals(typeID)) {
			return new Penguin("ţ��",77,88,"Ů");
		}else {"è��".equals(typeID);
            return new Cat("����",88,88);
        }               */
	}
}