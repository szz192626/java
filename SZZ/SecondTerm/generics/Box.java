package generics;
/**
 * ������Ķ����ʹ��
 * @author ��̬��
 *
 */
class ToyCat{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ToyCat() {
		
	}
	public ToyCat(String name) {
		this.name=name;
	}
	public String toString() {
		return "���"+this.name;
	}
}
class Cloth {
	public String toString() {
		return "��";
}
}
public class Box<T,M> {
     private T thing;
     private M madeof;
     public Box() {
    	 
     }
     public Box(T thing,M madeof) {
    	this.thing=thing;
    	this.madeof=madeof;
     }
     
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	public M getMadeof() {
		return madeof;
	}
	public void setMadeof(M madeof) {
		this.madeof = madeof;
	}
    public String toString() {
    	return"װ����"+this.thing+",����"+this.madeof+"�Ƴɵ�";
    }
	

     
}