package practicas2;

import java.util.*;

public class Ejercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: \n");
		String frase = sc.nextLine();

		//dividimos la oración en palabras usando el espacio como delimitador
		String[] palabras = frase.split(" ");

		//ordenamos las palabras por orden alfabético
		Arrays.sort(palabras);

		System.out.println("Palabras por orden alfabético: \n");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}
}
