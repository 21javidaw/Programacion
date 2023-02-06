package practicas1;

import java.util.*;
public class Ejercicio_10 {
	public static void main(String[] args) {
		int [] t1 = {1,5,11};
		int [] t2 = {2,4,10};
		
		
		int [] end = new int[(t1.length+t2.length)];
		
		for(int i = 0;i<end.length;i++) {
			if(t1[0] < t2[0]) {
				end[i] = t1[0];
				if(t1.length != 1) {
					t1 = smll(t1);
				}else {
					t1[0] =t2[t2.length-1]+1;
				}
			}else {
				end[i] = t2[0];
				if(t2.length != 1) {
					t2 = smll(t2);
				}else {
					t2[0] = t1[t1.length-1]+1;
				}
				
			}
			System.out.println(end[i] + "!");
		}
		
		
	}
	static int[] smll(int[]a) {
		
		int [] nuevo = new int[a.length-1];
		for(int i = 0;i<nuevo.length;i++) {
			nuevo[i] = a[i+1];
		}
		
		return nuevo;
	}
}
