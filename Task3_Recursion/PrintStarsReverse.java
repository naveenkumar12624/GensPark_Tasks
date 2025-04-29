package Task3_Recursion;
/*
 ******
 ****
 ***
 **
 *
*/

public class PrintStarsReverse {

	public static void printStarsReverse(int n) {
		if (n == 0) return;
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		printStarsReverse(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Reverse Star Pattern:");
		printStarsReverse(5);
	}
}
