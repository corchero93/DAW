package programacion.Tema4;

import java.util.Scanner;
public class Ejercicio14
{
	public static void main(String[] arg)
	{
		Scanner entrada= new Scanner(System.in);
		int nacimiento;
		int residuo;
		System.out.println("Introduce el año de tu nacimiento");
		nacimiento=entrada.nextInt();
		residuo= nacimiento %12;
		
			switch(residuo){
				case 0 : System.out.print("Tu sigo es el monkey");
				break;
				case 1 : System.out.print("Tu sigo es el rooster");
				break;
				case 2 : System.out.print("Tu sigo es el dog");
				break;
				case 3 : System.out.print("Tu sigo es el pig");
				break;
				case 4 : System.out.print("Tu sigo es el rat");
				break;
				case 5 : System.out.print("Tu sigo es el ox");
				break;
				case 6 : System.out.print("Tu sigo es el tiger");
				break;
				case 7 : System.out.print("Tu sigo es el rabbit");
				break;
				case 8 : System.out.print("Tu sigo es el dragon");
				break;
				case 9 : System.out.print("Tu sigo es el snake");
				break;
				case 10 : System.out.print("Tu sigo es el horse");
				break;
				case 11 : System.out.print("Tu sigo es el sheep");
				break;
				default: System.out.println("Tu año no corresponde con ningun signo");
				System.exit(1);
			}
		
	}
}
