package introducaoJava;

import java.util.Scanner;

public class ParImpa {
	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		Scanner entrada = new Scanner(System.in);
		int par = entrada.nextInt();
		if (par % 2 == 0) {
			System.out.println(par + " É: PAR");
		} else {
			System.out.println(par + " É: IMPAR");
			entrada.close();
		}
	}
}