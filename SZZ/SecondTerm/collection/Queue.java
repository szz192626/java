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
    	System.out.println("当前队列为：\n");
    	for(T t:list) {
    		str+=t.toString()+"\n";
    	}
    	return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue<Dog> dogqu=new Queue<>();
		dogqu.In(new Dog("旺旺",2,"京巴"));
		dogqu.In(new Dog("阿黄",5,"金毛"));
		
		System.out.println(dogqu);
		System.out.println("队首为："+dogqu.Out()+"  已被服务完，从队列中删除了");
		System.out.println("---------out一个后-----------");
		System.out.println(dogqu);
		
		dogqu.In(new Dog("小怪",5,"拉布拉多"));
		System.out.println("------------in一个以后--------------");
		System.out.println(dogqu);
	}

}
