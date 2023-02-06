package practicas1;

import java.util.*;

public class Ejercicio_07 {

	public static void main(String[] args) {
		int t[] = { 10, 1, 5, 8, 9, 2 };
		System.out.println(Arrays.toString(suma(t,3)));
		

	}

	public static int[] suma(int t[], int numElementos) {
		int sumas[] = new int[4];

		for (int i = 0; i <sumas.length; i++) {
			int contador=0;
			int temporal=0;
			for (int j = 0; j < numElementos; j++) {
				temporal=temporal+t[j+i];
				
			}
			if(i==5) {
				
			}else {
				sumas[i]= temporal;
			}
			

		}
		return sumas;
	}
}
