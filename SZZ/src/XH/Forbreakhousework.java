package XH;

public class Forbreakhousework {

	public static void main(String[] args) {
		boolean flag=true;
		for(int i=0,f=0;f<=10;i++,f+=i) {
			System.out.println(f);
			if(f>20) {
				System.out.println("���������������");
				flag=false;
				break;
			}
			if(flag==true) {
				System.out.println("��ǰ�ۼ�ֵ"+f);
			}
			
		}
		
		}

}