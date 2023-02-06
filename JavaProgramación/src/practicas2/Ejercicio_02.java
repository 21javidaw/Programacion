package practicas2;

import java.util.*;

public class Ejercicio_02 {
//Juego del ahorcado
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intentosMaximos = 7;
		String aPalabra, bLetra;
		do {
			System.out.println("Jugador A, escriba su palabra: ");
			aPalabra = sc.nextLine(); // leemos la palabra
		} while (aPalabra.isEmpty());

		int longitud = aPalabra.length();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for(int i=0;i<aPalabra.length();i++) {
			System.out.print(" _ ");
		}
	System.out.println("\n");
/*do {
	System.out.println("Jugador B, introduce una letra: ");
	bLetra=new Scanner(System.in).next();
	System.out.println("Letras correctas: "+letrasCorrectas(aPalabra,bLetra));
}while (!aPalabra.equals(bLetra));//mientras no acierte la palabra
System.out.println("Muy bien...");//si salimos del bucle quiere decir que ha acertado
	}
	static int letrasCorrectas(String a,String b) {
		int longitudMinima=Math.min(a.length(), b.length());//usamos la longitud minima de ambas cadenas para evitar extraer caracteres de más
		int contadorLetrasCorrectas=0;
		for(int i=0;i<longitudMinima;i++) {
			if(a.charAt(i)==b.charAt(i)) {
				contadorLetrasCorrectas++;
			}
		}
		return contadorLetrasCorrectas;*/
	}
}