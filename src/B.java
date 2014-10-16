import java.util.Scanner;
import java.util.Arrays;

public class B {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[][] a = new int[2][3];

		for (int i = 0; i < 2; i++) {
			String s = console.nextLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '+') {
					a[i][0]++;
				} else if (s.charAt(j) == '-') {
					a[i][1]++;
				} else {
					a[i][2]++;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("["+a[i][j]+"]");
			}
			System.out.println();
		}
	}
}
