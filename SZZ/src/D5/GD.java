package D5;

public class GD {

	public static void main(String[] args) {
		double score = 84;
		if (score > 85) {
			System.out.println("�ɼ���������һ̨����");
		}

		// java���ڵ���98�������ִ���80
		double javaScore = 98, musicScore = 85;
		if (javaScore >= 98 && musicScore > 80) {
			System.out.println("���ű����пɣ�����һ��");
		}

		/*
		 * javaScore=100; musicScore=78; if(javaScore>=100&&musicScore>70) {
		 * System.out.println("һ�ż������㣬����ֻҪ����̫�Ҳ���Խ���һ��");
		 */
		if (javaScore > 98 && musicScore > 80 || javaScore == 100 && musicScore > 70) {
			System.out.println("����һ��");
		}

	}
}
