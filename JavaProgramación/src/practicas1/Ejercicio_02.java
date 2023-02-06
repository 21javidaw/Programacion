package practicas1;

import java.util.*;

public class Ejercicio_02 {

	public static void main(String[] args) {

		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Tabla Ordenada\n" + Arrays.toString(tabla));
		desordenar(tabla);
		System.out.println("\nTabla Desordenada\n" + Arrays.toString(tabla));
	}

	public static void desordenar(int tabla[]) {
		Random random = new Random();
		int temporal;
		int indice;
		for (int j = tabla.length - 1; j > 0; j--) {
			indice = random.nextInt(j + 1);
			temporal = tabla[indice];
			tabla[indice] = tabla[j];
			tabla[j] = temporal;
		}
	}
}
