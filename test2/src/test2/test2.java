package test2;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int a = i;
		for(int b = 0; b < i; b++) {
			System.out.println(a);
			a--;
		}
		scanner.close();
	}

}
