package introducaoJava;

public class Soma100 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 100) {
			i = i + 1;
			i = i + i;
		}
		System.out.println(i);
	}
}