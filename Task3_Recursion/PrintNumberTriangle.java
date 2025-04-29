package Task3_Recursion;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class PrintNumberTriangle {

	public static void printNumberTriangle(int n) {
		if (n==0) return;
		printNumberTriangle(n - 1);
		for (int i =1; i <=n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Number Triangle:");
		printNumberTriangle(5);
	}
}
