package XH;

public class KTYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] scores= {12,98,56};
        System.out.println(scores);
        for(int i=0;i<scores.length;i++) {
		    System.out.println(scores[i]);
        }
        System.out.println("-----------------");
/*        scores=new double[40];
        scores[0]=85;
        scores[19]=65;
        scores[39]=90;*/   
        scores=new double[] {85.0,76.0,38,90,60,45};
        double sum=0;
	    System.out.println(scores);
        for(int i=0;i<scores.length;i++) {
		    System.out.println(scores[i]);
		    sum+=scores[i];
        }
        System.out.println("平均分为"+sum/scores.length);
        
	}

}