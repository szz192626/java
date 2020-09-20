package inherit;

public class Goat extends Animal {

	public Goat() {

	}

	public Goat(String name) {
		super(name);

	}

	public void run() {
		System.out.println(this.getName() + "正在极力狂奔");
	}

	public void eatSomething(String food) {
		System.out.println(food + "被" + this.getName() + "吃");
	}
}
