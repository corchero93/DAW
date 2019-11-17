package programacion.Tema4;

import java.util.Scanner;
public class Ejercicio17
{
	public static void main(String[] arg)
	{
		Scanner entrada= new Scanner(System.in);
		double x,y,z;
		System.out.println("Introduce un valor");
		x=entrada.nextDouble();
		System.out.println("Introduce un valor");
		y=entrada.nextDouble();
		System.out.println("Introduce un valor");
		z=entrada.nextDouble();
		System.out.println((x<y && y<z) ?"ordenado " : "no ordenado");
	}
}
