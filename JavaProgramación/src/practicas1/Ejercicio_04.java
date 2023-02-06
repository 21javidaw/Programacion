package practicas1;

import java.util.*;

public class Ejercicio_04 {
	static int tSueldos[] = new int[1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu sueldo");
		int aSueldo = sc.nextInt();
		tSueldos[0] = aSueldo;
		System.out.println(Arrays.toString(tSueldos));

		while (aSueldo != -1) {
			System.out.println("Introduce tu sueldo");
			aSueldo = sc.nextInt();
			if (aSueldo != -1) {
				copiar(tSueldos, aSueldo);
				System.out.print(Arrays.toString(tSueldos));

			}

		}
		int media = 0;
		Arrays.sort(tSueldos);
		for (int i = tSueldos.length - 1; i >= 0; i--) {
			System.out.println(tSueldos[i]);
			media += tSueldos[i];
		}

		System.out.println("Sueldo minimo: " + tSueldos[0]);
		System.out.println("Sueldo maximo: " + tSueldos[tSueldos.length - 1]);

		System.out.println("La media es: " + (media/tSueldos.length));

	}

	public static void copiar(int tSueldos2[], int aSueldo) {
		int tempSueldos[] = new int[tSueldos2.length + 1];
		for (int i = 0; i < tSueldos2.length; i++) {
			tempSueldos[i] = tSueldos2[i];
			if (i == tSueldos2.length - 1) {
				tempSueldos[i + 1] = aSueldo;
			}

		}
		tSueldos = tempSueldos;
	}
}
