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
		dogqu.In(new Dog("����", 3, "�»�"));
		dogqu.In(new Dog("����", 3, "��ë"));
		System.out.println("��ǰ����ݵĹ�����\n" + dogqu);
		dogqu.In(new Dog("����", 4, "��ʿ��"));
		System.out.println("���Ӻ󣬵�ǰ����ݵĹ�����\n" + dogqu);
		System.out.println("ջβΪ��\n" + dogqu.Out() + "  �Ѿ��µ��ݣ���ջ��ɾ����");
		System.out.println("���ڵ�����ʣ�µĹ���Ϊ��\n" + dogqu);

	}

}
