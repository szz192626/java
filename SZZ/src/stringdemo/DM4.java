package stringdemo;

public class DM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abc";
        str = str + "def"+12345;
        System.out.println(str);
        
        int locchar=str.indexOf('d');
        System.out.println("��"+locchar+"���ַ�Ϊ"+'d');
        
        int locsubstr=str.indexOf("123");
        System.out.println("��"+locsubstr+"���ַ�Ϊ"+"123");
        
        String date="20191118";
        
        String month=date.substring(4,6);
        String day=date.substring(6);
       
        String words="��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ";
        
        String[] strarr=words.split(" ");
        for(String word:strarr) {
        	System.out.println(word);
        }

        words="��ͤ��,�ŵ���,���ݱ�����,����,�������� Ϧ��ɽ��ɽ";
        
        strarr=words.split(",");
        for(String word:strarr) {
        	System.out.println(word);
        }
        
        System.out.println("�·�Ϊ"+month+","+day+"��");
        
        String str2="xyz";
        String str3 = str2.concat("abc");
        System.out.println(str3);
        
        
        
        
        
        
	}

}