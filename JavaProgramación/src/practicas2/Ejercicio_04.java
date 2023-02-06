package practicas2;

import java.util.*;

public class Ejercicio_04 {
	public static void main(String[] args) {
		Scanner frasePalabra = new Scanner(System.in);
		System.out.println("Introduce una frase o palabra: ");
		String palabra = frasePalabra.nextLine();
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < palabra.length(); i++) {
			char c = palabra.charAt(i);
			switch (c) {
			case 'a':
				resultado.append('@');
				break;
			case 'e':
				resultado.append('€');
				break;
			case 'i':
				resultado.append('1');
				break;
			case 'o':
				resultado.append('0');
				break;
			case 'u':
				resultado.append('µ');
				break;
			default:
				resultado.append(c);
			}
		}

		System.out.println("Frase o palabra modificada: " + resultado.toString());
	}
}
