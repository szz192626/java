package collection;

import java.util.LinkedList;

public class Elevator<T> {
	private LinkedList<T> list = new LinkedList<>();

	public void In(T t) {
		this.list.addLast(t);
	}

	public T Out() {
		return this.list.removeLast();
	}

	public boolean isEmpty() {
		if (this.list.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		String string = "";
        for (T t : list) {
			string += t.toString() + "\n";
		}
		return string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator<Dog> dogqu = new Elevator<>();
		dogqu.In(new Dog("方方", 3, "柯基"));
		dogqu.In(new Dog("沁沁", 3, "黄毛"));
		System.out.println("当前入电梯的狗狗：\n" + dogqu);
		dogqu.In(new Dog("周舟", 4, "哈士奇"));
		System.out.println("增加后，当前入电梯的狗狗：\n" + dogqu);
		System.out.println("栈尾为：\n" + dogqu.Out() + "  已经下电梯，从栈中删除了");
		System.out.println("现在电梯中剩下的狗狗为；\n" + dogqu);

	}

}
