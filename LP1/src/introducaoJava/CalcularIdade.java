package introducaoJava;

import java.util.Scanner;
import java.util.Calendar;

public class CalcularIdade {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int anoAtu = cal.get(Calendar.YEAR);
		Scanner entrada = new Scanner(System.in);
		System.out.println(cal.getTime() + "\n");
		System.out.println("Digite o ano em que nasceu: ");
		int ano = entrada.nextInt();
		int idade = anoAtu - ano;
		System.out.println("\nVocê tem " + idade + " anos");
		entrada.close();
	}
}