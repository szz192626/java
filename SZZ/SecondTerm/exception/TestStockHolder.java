package exception;

public class TestStockHolder {

	public static void main(String[] args) {
		StockHolder stockHolder=new StockHolder();
       try {
    	   stockHolder.setLimitoftrade(14);
    	   stockHolder.setMarket("����");
       }catch(Exception e){
    	   System.out.println("��ͣ���ȳ����쳣���ѱ�����");
       }finally {
		System.out.println("������ֹ��");
	}
	}

}
