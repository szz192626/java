package supermarket1;



//��Ʒ��
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
			System.out.print("���Ϊ��"+No);
	        System.out.print("����Ϊ��"+name);
	        System.out.println("����Ϊ��"+price);
	        System.out.println("��Ա��Ϊ��"+unitprice);
	        System.out.println("�������Ϊ��"+Number);
	        
	        
	        
		}

	}
	
	
