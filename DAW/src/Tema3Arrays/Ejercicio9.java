package Tema3Arrays;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada = new Scanner(System.in);
			int [] pulas= new int[8];
			for(int i=0; i<pulas.length; i++) {
				System.out.print("\n introduce el numero");
				pulas[i]=entrada.nextInt();
			}
			for(int i= 0; i<pulas.length; i++) {
				if(pulas[i]%2==0) {
					System.out.print(pulas[i] +"par ");
				}else System.out.print(pulas[i] +"impar ");
			}
	}

}
