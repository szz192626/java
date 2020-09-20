package exception;

public class Persons {
    private String name="方方";
    private int age=0;
    private String sex="男";
	public void setSex(String sex) {
		try {
		
		if("男".equals(sex)||"女".equals(sex)) {
			this.sex=sex;
		}else {
			throw new XBException("性别必须是\"男\"或者\"女\"!");//抛出异常
		}
		}catch(XBException e){
          System.out.println("出现性别输入异常，已被捕获！");			
		}
		
	}
	public class XBException extends Exception {
		public XBException(String message) {
			super(message);
		}
	}
		public static void main(String[] args ) {
         Persons persons=new Persons();
			persons.setSex("0");
		}
	}
	

  