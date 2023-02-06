package practicas1;

import java.util.*;

public class Ejercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean magico = false;
		int tabla[][];// int tabla[][] es el numero de columnas y filas (X="columnas", Y="filas")
		tabla = new int[4][4];
		System.out.println("Introduce 4 numeros por fila");
		for (int i = 0; i < 4; i++) { // eje X
			for (int j = 0; j < 4; j++) { // eje Y
				tabla[i][j] = sc.nextInt();// leemos el elemento [i][j]
			}
		}
		int sumaF0 = (tabla[0][0] + tabla[0][1] + tabla[0][2] + tabla[0][3]);
		int sumaF1 = (tabla[1][0] + tabla[1][1] + tabla[1][2] + tabla[1][3]);
		int sumaF2 = (tabla[2][0] + tabla[2][1] + tabla[2][2] + tabla[2][3]);
		int sumaF3 = (tabla[3][0] + tabla[3][1] + tabla[3][2] + tabla[3][3]);
		int sumaC0 = (tabla[0][0] + tabla[1][0] + tabla[2][0] + tabla[3][0]);
		int sumaC1 = (tabla[0][1] + tabla[1][1] + tabla[2][1] + tabla[3][1]);
		int sumaC2 = (tabla[0][2] + tabla[1][2] + tabla[2][2] + tabla[3][2]);
		int sumaC3 = (tabla[0][3] + tabla[1][3] + tabla[2][3] + tabla[3][3]);
		mostrarMatriz(tabla);
		for (int n = 0; n < tabla.length; n++) {
			if ((sumaF0 == sumaF1) && (sumaF2 == sumaF3)) {
				if (sumaF3 == sumaF0) {
					if ((sumaC0 == sumaC1) && (sumaC2 == sumaC3)) {
						if (sumaC0 == sumaC2) {
							if (sumaC0 == sumaF0) {
								magico = true;
							}
						}
					}

				}
			}

		}
		if (magico) {
			System.out.println("Es magico");
		}else {
			System.out.println("No es magico");
		}
	}

	public static void mostrarMatriz(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.printf("%5d", A[i][j]);
			}
			System.out.println();
		}
	}
}
