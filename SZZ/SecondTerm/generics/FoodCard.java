package generics;

public class FoodCard extends Student{
     private String name;
     private double money;
     public FoodCard() {
    	 
     }
	public FoodCard(String userid,String name,double money) {
		super(userid);
		this.name=name;
		this.money=money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String toString() {
		return "–’√˚£∫"+name+ "”‡∂Ó£∫"+money;
	}
}
