package practicas1;

import java.util.*;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de celdas de la tabla");
		int t[] = new int [sc.nextInt()];
		for(int i = 0; i<t.length ; i++) {
			System.out.println("Dame el numero " + (i+1));
			t[i]=sc.nextInt();
		}
		System.out.println("Introduce el numero a buscar");
		int nb= sc.nextInt();
		System.out.println("El numero se encuentra en la celda "+buscar(t, nb));
		
	}

	static int buscar(int tabla[], int clave) {
		int indiceBusqueda = 0;
		while (indiceBusqueda < tabla.length && tabla[indiceBusqueda] != clave) {
			indiceBusqueda++;
		}
		if (indiceBusqueda < tabla.length) {

		} else {
			System.out.println("No encontrado");
			indiceBusqueda = -2;
		}
		return (indiceBusqueda+1);
	}

}
