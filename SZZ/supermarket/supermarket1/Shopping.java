package supermarket1;
//���ﳵ��
public class Shopping {
	private static final int maxLen=40;
	         static   int Len=0;
	   private static Good[] data = new Good[maxLen];
	   public static int getLen() {
		   return Len;
		    }	
	   public  static Good[] getData() {
		   return data;
		   
	   }
	 public void printThis() {
		 data[1]= new Good( 01," ����",3,2.4,100);
		 data[2]= new Good(02,"��Ȫˮ",2,1.6,100);
		 data[3]= new Good(03,"Ҭ��֭",8,6.4,100);
		 data[4]= new Good(04,"ţ��",2,1.6,100);
		 data[5]= new Good(05,"��Ƭ",6,4.8,100);
		 data[6]= new Good(06,"����",5,4,200);
		 data[7]= new Good(07,"����",6,4.8,200);
		
		 

		 
		 
		 for(int i=0;i<data.length;i++) {
			 System.out.println(data[i]);
		 }
	 }
	
}