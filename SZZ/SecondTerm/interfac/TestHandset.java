package interfac;

public class TestHandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Network handset1 =new AptitudeHandst("��Ϊ","���ܻ�");
        handset1.hashCode();
        handset1.networkConn();
        TheakePictures theakePictures =new AptitudeHandst("ƻ��","���ܻ�");
        theakePictures.takePictare();
        PlayWiring handset2 =new CommonHandset("����", "��ͨ�ֻ�");
        handset2.play();
        System.out.println("���ڲ���  "+ PlayWiring.content);
        }
}