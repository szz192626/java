package exception;

public class Persons {
    private String name="����";
    private int age=0;
    private String sex="��";
	public void setSex(String sex) {
		try {
		
		if("��".equals(sex)||"Ů".equals(sex)) {
			this.sex=sex;
		}else {
			throw new XBException("�Ա������\"��\"����\"Ů\"!");//�׳��쳣
		}
		}catch(XBException e){
          System.out.println("�����Ա������쳣���ѱ�����");			
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
	

  