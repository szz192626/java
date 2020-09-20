package exception;

public class NotZeroSelfException extends Exception{
	    private int devidedNum;
	    
		public int getDevidedNum() {
			return devidedNum;
		}

		public void setDevidedNum(int devidedNum) {
			this.devidedNum = devidedNum;
		}

		public NotZeroSelfException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public NotZeroSelfException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}	
	}

