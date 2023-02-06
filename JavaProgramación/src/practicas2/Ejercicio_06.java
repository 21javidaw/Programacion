package practicas2;

import java.util.*;

public class Ejercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();

		StringBuilder fraseNomenglatura = new StringBuilder();
		boolean toUpperCase = false;
		for (char c : frase.toCharArray()) {
			if (Character.isWhitespace(c)) {
				toUpperCase = true;
			} else if (toUpperCase) {
				fraseNomenglatura.append(Character.toUpperCase(c));
				toUpperCase = false;
			} else {
				fraseNomenglatura.append(c);
			}
		}

		System.out.println("Frase con nomenclatura Camel: " + fraseNomenglatura);
	}
}