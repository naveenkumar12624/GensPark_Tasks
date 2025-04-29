package Task3_Recursion;
public class PrintAscDescOrder {

	public static void printAscDesc(int n) {
		if (n == 0) return;
		System.out.print(n + " ");
		printAscDesc(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		System.out.println("Ascending + Descending Order:");
		printAscDesc(5);
	}
}
