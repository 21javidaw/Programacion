package practicas2;

import java.util.*;

public class Ejercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la sentencia: ");
		String sentencia = sc.nextLine();

		//usamos un indicador booleano para rastrear si el carácter actual está dentro
		//de un comentario
		boolean inComentario = false;
		StringBuilder resultado = new StringBuilder();

		//repetimos a través de cada carácter en la declaración
		for (int i = 0; i < sentencia.length(); i++) {
			char caracter = sentencia.charAt(i);

			//comprobamos si se introduce un comentario
			if (caracter == '/' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '*') {
				inComentario = true;
				i++;
			}
			//comprobamos si se finaliza un comentario
			else if (caracter == '*' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '/') {
				inComentario = false;
				i++;
			}
			//agregamos el carácter al resultado si no está dentro de un comentario
			else if (!inComentario) {
				resultado.append(caracter);
			}
		}

		System.out.println("Salida sin comentarios: " + resultado);
	}
}
