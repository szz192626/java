package collection;

public class Penguin {
	private String name;
	private String loveQ;

	public Penguin() {

	}

	public Penguin(String name, String loveQ) {
		this.name = name;
		this.loveQ = loveQ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoveQ() {
		return loveQ;
	}

	public void setLoveQ(String loveQ) {
		this.loveQ = loveQ;
	}

	public String toString() {
		return "Ãû×Ö£º" + this.name + "\tQÐÔ±ð£º" + this.loveQ;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Penguin) {
			Penguin penguin = (Penguin) obj;
			if (this.getName().equals(penguin.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
