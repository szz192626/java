package collection;

import java.util.LinkedList;

public class Queue<T> {
	private LinkedList<T> list = new LinkedList<T>();

	public void In(T t) {
		this.list.addLast(t);
	}

	public T Out() {

		return this.list.removeFirst();

	}

	public boolean isEmpty() {
		if (this.list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
    public String toString() {
    	String str="";
    	System.out.println("��ǰ����Ϊ��\n");
    	for(T t:list) {
    		str+=t.toString()+"\n";
    	}
    	return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue<Dog> dogqu=new Queue<>();
		dogqu.In(new Dog("����",2,"����"));
		dogqu.In(new Dog("����",5,"��ë"));
		
		System.out.println(dogqu);
		System.out.println("����Ϊ��"+dogqu.Out()+"  �ѱ������꣬�Ӷ�����ɾ����");
		System.out.println("---------outһ����-----------");
		System.out.println(dogqu);
		
		dogqu.In(new Dog("С��",5,"��������"));
		System.out.println("------------inһ���Ժ�--------------");
		System.out.println(dogqu);
	}

}