package collection;

public class Dog implements Comparable<Dog>{
	private String name;// ��Ϊ���˵�����
	private int age;
	private String strain;

	public Dog() {

	}

	public Dog(String name, int age, String stain) {
		this.name = name;
		this.age = age;
		this.strain = stain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String toString() {
		return "����:" + this.name + "\t���䣺" + this.age + "\tƷ�֣�" + this.strain;
	}
	public int hashCode() {
		int prime=31;
		int result=17;
		result=prime*result+(this.name!=null?this.name.hashCode():0);
	    result=prime*result+(this.strain!=null?this.strain.hashCode():0);
        
	    return result;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Dog) {
			Dog dog=(Dog) obj;
			if(this.name.equals(dog.getName())&&this.name.equals(dog.getName())) {
				return true;
			}else {
				return false;
			}
			}else {
			return false;
		}
	}

	@Override
	public int compareTo(Dog o) {
//		������ʹ��age����ΪTreeSet�����ж��Ƿ���ͬһ��������ݣ�
//		�������equals���ж�ԭ��һ���������������Ƽ�����Ϊչʾ����˱���
		// TODO Auto-generated method stub
//		��1��-1����
	if(this.age<o.getAge()) {
		return 1;
	}else if(this.age>o.getAge()) {
		return -1;
	}else {
	    return 0;
	}
	
	}
	
	}
