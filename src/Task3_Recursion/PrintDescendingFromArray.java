package Task3_Recursion;

public class PrintDescendingFromArray {

	public static void printDescending(int[] arr, int index) {
		if (index < 0) return;
		System.out.print(arr[index] + " ");
		printDescending(arr, index - 1);
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("Descending Order:");
		printDescending(array, array.length - 1);
	}
}
