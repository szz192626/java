package internalclass;



public class TestInternalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ա�ڲ���
       
       
       Exernal.Internal internal2=new Exernal().new Internal();
       
       internal2.print();
       //�ֲ��ڲ������
       Exernal exter=new  Exernal();
       exter.show();
       //��̬�ڲ������
       
       
	}

}
