package Task3_Recursion;
public class PrintAscendingFromArray {

	public static void printAscending(int[] arr, int index) {
		if (index == arr.length) return;
		printAscending(arr, index + 1);
		System.out.print(arr[index] + " ");
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("Ascending Order:");
		printAscending(array, 0);
	}
}
