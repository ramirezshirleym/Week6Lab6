import java.util.Scanner;

public class Exercise1 {

	public static void printLoops(int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				for (int k = 1; k <= n; k++) {
					System.out.println(i);
					System.out.println(j);
					System.out.println(k);
					System.out.println();
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n;

		System.out.print("Enter an integer greater than 1: ");
		n = scan.nextInt();
		scan.close();

		printLoops(n);

	}

}
