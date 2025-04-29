package Task3_Recursion;
/*
 *
 **
 ****
 *****
 ******
 */

public class PrintStarsForward {

	public static void printStarsForward(int n) {
		if (n == 0) return;
		printStarsForward(n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Forward Star Pattern:");
		printStarsForward(5);
	}
}
