package inherit;

public class PetTest {

	public static void main(String[] args) {
		
     Dog dog1 =new Dog("ahuang",80,50,"��ë");
     System.out.println(dog1.toString());
     Dog dog2=new Dog ("ahuang",80,50,"��ë");
     System.out.println(dog2);
     Dog dog3 =dog2;
     
     if(dog1.equals(dog2)) {//���Dog����û����дequals���������==��һ���ģ��Ƚϵ������������Ƿ�ָ��ͬһ������ʵ��
    	 System.out.println("��ͬ�����ݣ�������ʵ����ͬ�����￴����ͬ");
    	 }else {
         System.out.println("��ͬ�����ݣ�������������ʵ������Ҳ��ָ��ͬһ������ʵ����û������ʱ������������ͬ��Ҳ��Ϊ����ͬһ������");
    	 }
     
 /*    String str =new String("abc");
     Pet pet1=new Pet();
      pet1=dog1;
      if(str==dog1){
      //��java�����ǲ��ɱȵģ���������û�м̳й�ϵ��java���벻��
       }
     if(pet1==dog1) {
    	 
     }*/
	  }
}