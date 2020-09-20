package D5;

public class GD {

	public static void main(String[] args) {
		double score = 84;
		if (score > 85) {
			System.out.println("成绩不错，奖励一台电脑");
		}

		// java大于等于98，且音乐大于80
		double javaScore = 98, musicScore = 85;
		if (javaScore >= 98 && musicScore > 80) {
			System.out.println("两门表现尚可，奖励一下");
		}

		/*
		 * javaScore=100; musicScore=78; if(javaScore>=100&&musicScore>70) {
		 * System.out.println("一门及其优秀，其他只要不是太差，也可以奖励一下");
		 */
		if (javaScore > 98 && musicScore > 80 || javaScore == 100 && musicScore > 70) {
			System.out.println("奖励一下");
		}

	}
}
