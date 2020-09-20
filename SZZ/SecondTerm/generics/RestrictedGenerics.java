package generics;

public class RestrictedGenerics<T extends Number> {
    private T price;
    public RestrictedGenerics() {
    	
    }
	public RestrictedGenerics(T price) {
		this.price=price;
	}
	public T getPrice() {
		return price;
	}
	public void setPrice(T price) {
		this.price = price;
	}
	public  String toString() {
		return this.price.toString();
	}
	public static void main(String[] args) {
		RestrictedGenerics<Integer> rg=new RestrictedGenerics<Integer>(12); 
		System.out.println(rg);
		
		

	}

}
