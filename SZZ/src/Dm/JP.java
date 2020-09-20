package Dm;

public class JP {

	public static void main(String[] args) {

		boolean dj = true;
		boolean swc = true;

		double a = 500;
		if (dj) {
			if (swc) {
				System.out.println("票价" + 0.7 * a);
			} else {
				System.out.println("票价" + 0.5 * a);
			}
		} else {
			if (swc) {
				System.out.println("票价" + 0.9 * a);
			} else {
				System.out.println("票价" + 0.8 * a);
			}
		}
	}
}
