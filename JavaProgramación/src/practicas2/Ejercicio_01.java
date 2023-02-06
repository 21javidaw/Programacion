package practicas2;
import java.util.*;
public class Ejercicio_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "", fraseCodificada = "", fraseDecodificada="";
		char letra = 0;
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		System.out.println("Introducir frase: ");
		frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			fraseCodificada = fraseCodificada + codifica(conjunto1, conjunto2, letra);
		}
		System.out.println(fraseCodificada);
		
		
		for (int i = 0; i < fraseCodificada.length(); i++) {
			letra = fraseCodificada.charAt(i);
			fraseDecodificada = fraseDecodificada + decodifica(conjunto1, conjunto2, letra);
		}
		System.out.println(fraseDecodificada);
	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {
		char codificado;
		int indiceBusqueda = buscar(conjunto1, c);
		if (indiceBusqueda != -1) {
			codificado = conjunto2[indiceBusqueda];
		} else {
			codificado = c;
		}

		return codificado;
	}
	static char decodifica(char conjunto1[], char conjunto2[], char c) {
		char decodificado;
		int indiceBusqueda = buscar(conjunto2, c);
		if (indiceBusqueda != -1) {
			decodificado = conjunto1[indiceBusqueda];
		} else {
			decodificado = c;
		}

		return decodificado;
	}

	static int buscar(char t[], char claveBusqueda) {
		int indiceBusqueda = 0;
		while (indiceBusqueda < t.length && t[indiceBusqueda] != claveBusqueda) {
			indiceBusqueda++;
		}
		if (indiceBusqueda < t.length) {

		} else {
			// System.out.println("No encontrado");
			indiceBusqueda = -1;
		}
		return indiceBusqueda;
	}
}
