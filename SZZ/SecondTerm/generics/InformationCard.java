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
		return "װ����"+ this.info +"�������Ϣ";
	}
}