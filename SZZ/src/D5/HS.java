package D5;

public class HS {

	public static void main(String[] args) {
		int x = 10;
		if (x > 0 && x < 3) {
			System.out.println("Êä³ö" + 1);
		} else if (x >= 3 && x < 5) {
			int y = 2 * x;
			System.out.println("Êä³ö" + y);
		} else {
			int y = x * x + 5 * x + 1;
			System.out.println("Êä³ö" + y);
		}
	}
}