package practicas1;

import java.util.*;

public class Ejercicio_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos[] = new int[5];

		for (int i = 0; i < alumnos.length; i++) {
			int mediaAlumno = 0;
			for (int j = 1; j <= 3; j++) {
				System.out.println("Introduce la " + j + "º nota del alumno " + (i + 1));
				int temporal = sc.nextInt();
				mediaAlumno = mediaAlumno + temporal;
			}
			mediaAlumno = mediaAlumno / 3;
			alumnos[i] = mediaAlumno;
		}
		System.out.println("Introduzca el numero de alumno a comprobar (El numero tiene que estar entre 1 y 5): ");
		int busqueda = -1;
		do {
			busqueda = sc.nextInt();
		} while (busqueda < 0 && busqueda > 5);

		System.out.println("La nota media del alumno selccionado es: " + alumnos[busqueda - 1]);
		int mediaGrupo = 0;
		for (int i = 0; i < alumnos.length; i++) {
			int temporal = alumnos[i];
			mediaGrupo = mediaGrupo + temporal;
		}
		System.out.println("La nota media del grupo es: " + (mediaGrupo / 5));
	}
}
