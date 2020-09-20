package stringdemo;

public class DM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12/45";
		
		String[] strarr=str.split("/");
		
		boolean isTwoNum=strarr[0].matches("\\d{2}");
		int month=Integer.parseInt(strarr[0]);
	
		
		
	   
	}

}