package generics;

public class ArrayGeneric {
	public static <A> A getTheSecondLastElement(A[] arr) {
		return arr[arr.length - 2];

	}

	public static void main(String[] args) {
		ArrayGeneric arrayGeneric = new ArrayGeneric();
		Integer[] arr = new Integer[] { 1, 2, 3, 8, 4, };
		int temper = arrayGeneric.getTheSecondLastElement(arr);
		System.out.println(temper);

	}
}
