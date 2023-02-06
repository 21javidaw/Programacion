package practicas1;

import java.util.Scanner;

public class Ejercicio_06 {
	
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce el numero de columnas y filas:");
		
		int aColumnas=sc.nextInt();
		int aFilas=sc.nextInt();
		
		int filas;
		int columnas;
		
		filas=aFilas;
		columnas=aColumnas;
		int[][] tablero = new int[filas][columnas];
		System.out.print("\n");
		int y;
		int x;
		// Imprimir encabezado
		System.out.print("| ");
		for (x = 0; x < columnas; x++) {
			System.out.printf("|%d", x + 1);
		}
		System.out.print("|\n");
		for (y = 0; y < filas; y++) {
			System.out.printf("|%d", y + 1);
			for (x = 0; x < columnas; x++) {
				System.out.printf("|%c", tablero[y][x]);
			}
			System.out.print("|\n");
		}

	}
}
