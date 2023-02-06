package practicas2;

import java.util.*;

public class Ejercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		String ultima = "";
		System.out.println("Introduce el valor de 'n': ");
		int n = sc.nextInt();

		for (int i = 0; i < palabra.length(); i++) {
			while (palabra.length() - i >= n) {
				System.out.println(palabra.substring(i, i + n));
				i = i + n;
			}
			if (palabra.length() - i < n) {
				ultima = ultima + palabra.charAt(i);

			}

		}
		System.out.println(ultima);
	}
}
