package exception;

public class TestStockHolder {

	public static void main(String[] args) {
		StockHolder stockHolder=new StockHolder();
       try {
    	   stockHolder.setLimitoftrade(14);
    	   stockHolder.setMarket("卖出");
       }catch(Exception e){
    	   System.out.println("涨停幅度出现异常，已被捕获！");
       }finally {
		System.out.println("程序终止！");
	}
	}

}
