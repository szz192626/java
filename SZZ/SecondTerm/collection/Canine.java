package collection;

public class Canine {
	private String name;
	private String num;

	public Canine() {

	}

	public Canine(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String toString() {
		return "名字:" + this.name + "\t主人电话号码：" + this.num;
	}

	public int hashCode() {
		return this.name.hashCode() + this.num.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Canine) {
			Canine canine = (Canine) obj;
			if (this.name.equals(canine.getName()) && this.num.equals(canine.num)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
