import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int stairs = Integer.parseInt(console.next());
		int multiplier = Integer.parseInt(console.next());
		int answer = stairs / 2;
		boolean run = true;
		
		if (stairs < multiplier){
			answer = -1;
			run = false;
		}
		while((answer % multiplier) != 0 && run){
			answer++;
		}
		console.close();
		System.out.println(answer);
	}
}