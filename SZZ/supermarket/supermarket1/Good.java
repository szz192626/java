package supermarket1;



//商品类
public class Good {
	
		
		private int No;
		private  int Number;
		private double price;
		private String name;
		private double unitprice;
		
	  static   int num=0;
	static	 int num1=0;
	static	 int num2=0;
	 private  static double sum=0;
	static	 int[] goodsnum = new int[10];
		
		public Good(int No,String name,double price,double unitprice,int Number)
		{
			this.No=No;
			this.price=price;
			this.name=name;
			this.unitprice=unitprice;
			this.Number=Number;
			num++;
			System.out.println("  ");
			System.out.print("编号为："+No);
	        System.out.print("名称为："+name);
	        System.out.println("单价为："+price);
	        System.out.println("会员价为："+unitprice);
	        System.out.println("库存数量为："+Number);
	        
	        
	        
		}

	}
	
	
