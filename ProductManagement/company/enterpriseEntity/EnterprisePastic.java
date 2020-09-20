package enterpriseEntity;

public class EnterprisePastic {
	private int id;
	private int weeklate;
	private int mouthlate;
	private String yearprize;
	public  EnterprisePastic() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWeeklate() {
		return weeklate;
	}
	public void setWeeklate(int weeklate) {
		this.weeklate = weeklate;
	}
	public int getMouthlate() {
		return mouthlate;
	}
	public void setMouthlate(int mouthlate) {
		this.mouthlate = mouthlate;
	}
	public String getYearprize() {
		return yearprize;
	}
	public void setYearprize(String yearprize) {
		this.yearprize = yearprize;
	}

	@Override
	public String toString() {
		return " [工号：" + id + ", 周迟次数：" + weeklate + ", 月迟次数：" + mouthlate + ", 年终奖：" + yearprize
				+ "]";
	}

}
