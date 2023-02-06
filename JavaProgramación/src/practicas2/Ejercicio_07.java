package practicas2;

import java.util.*;

public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		System.out.println("Introduce la palabra que quieres cambiar: ");
		String palabraCambiada = sc.nextLine();
		System.out.println("Introduce la palabra por la que la quieres cambiarla: ");
		String palabraCambio = sc.nextLine();

		String cambiarTexto = texto.replaceAll(palabraCambiada, palabraCambio);
		System.out.println("The modified text is: ");
		System.out.println(cambiarTexto);
	}
}
