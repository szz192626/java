package inherit;

public class Goat extends Animal {

	public Goat() {

	}

	public Goat(String name) {
		super(name);

	}

	public void run() {
		System.out.println(this.getName() + "���ڼ�����");
	}

	public void eatSomething(String food) {
		System.out.println(food + "��" + this.getName() + "��");
	}
}
