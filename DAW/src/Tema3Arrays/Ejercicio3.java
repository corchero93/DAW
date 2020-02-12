package Tema3Arrays;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] p= new int[10];
		int a,s,d,f,g,h,j,k,l,ñ;
		for(int q=0; q<p.length;q++) {
			System.out.println("introduce el numero");
			p[q]=entrada.nextInt(); //con esto hacemos que recorra todo poniendo el system
		}
		//a=entrada.nextInt();
		//}

		for(int i=p.length-1;i>=0;i--) { //para poder hacer que de la vuelta tenemos que hacer
			System.out.print(p[i]+ " "); // que empiece a mirar desde el ultimo que es 
										// valor -1 y -- para irle restando posiciones
		}
			
		}
	}


