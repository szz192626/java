package exception;

public class StockHolder {
    private String market;
    private double Limitoftrade ;
	
	public void setLimitoftrade(double limitoftrade) {
		Limitoftrade = limitoftrade;
	}

	public void setMarket(String market)throws Exception {
		if(Limitoftrade<=10) {
			this.market=market;
		}else {
			throw new tradeException("Âô³ö³¬¹ýÕÇ·ù");
		}
		this.market = market;
	}
	public class tradeException extends Exception{
		public tradeException(String message) {
			super(message);
		}
		}
	}
