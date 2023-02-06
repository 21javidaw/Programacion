package practicas1;

import java.util.*;

public class Ejercicio_03 {
	public static void main(String[] args) {

		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Tabla Original\n" + Arrays.toString(tabla));
		
		System.out.println("\nTabla 2 Desordenada\n" + Arrays.toString(desordenar(tabla)));
		System.out.println("\nTabla Ordenada\n" + Arrays.toString(tabla));
	}

	public static int[] desordenar(int tabla[]) {
		Random random = new Random();
		int tabla2[]= new int[tabla.length];
		for(int i=0;i<tabla2.length;i++) {
			tabla2[i]=tabla[i];
		}
		int temporal;
		int indice;
		for (int j = tabla2.length - 1; j > 0; j--) {
			indice = random.nextInt(j + 1);
			temporal = tabla2[indice];
			tabla2[indice] = tabla2[j];
			tabla2[j] = temporal;
		}
		return tabla2;
	}
}
