package Tema3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] p = new int[15];
		int[] r = new int[15];
		System.out.println(p.length);
		for (int i = 0; i < p.length; i++) {
			System.out.println("Introduce tus numeros");
			p[i] = entrada.nextInt();
		}
		for (int i = 0; i < r.length; i++) {
			if (i > 0) {
				r[i] = p[i - 1];
			} else {
				r[i] = p[r.length - 1];
			}
		}
		System.out.println(Arrays.toString(r));
}

}
