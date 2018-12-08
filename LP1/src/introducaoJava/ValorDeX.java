package introducaoJava;

import java.util.Scanner;

public class ValorDeX {

	public static void main(String[] args) {
		System.out.println("Digite o valor de X: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.print(x + " ");
		}
		sc.close();
	}
}