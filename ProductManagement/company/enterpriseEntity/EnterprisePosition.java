package enterpriseEntity;

public class EnterprisePosition {
	private int id;
	private String name;
	private String work;
	private String promotion;
	public EnterprisePosition(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	@Override
	public String toString() {
		return "[ 工号:"+ id +", 姓名：" + name + ", 职位：" + work + ", 待升职位：" + promotion + "]";
	}

}
