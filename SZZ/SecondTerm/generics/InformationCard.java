package generics;

public class InformationCard<T> {
        private T info;
    public InformationCard() {
    	
    }
    public InformationCard(T info) {
    	this.info=info;
    }
		public T getInfo() {
			return info;
		}

		public void setInfo(T info) {
			this.info = info;
		}
	public String toString() {
		return "装的是"+ this.info +"等相关信息";
	}
}
