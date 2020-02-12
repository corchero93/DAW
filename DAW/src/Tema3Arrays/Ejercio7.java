package Tema3Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada= new Scanner(System.in);
			int [] p= new int[100];
			int a; 
			int b;
			
			for (int i=0;i<p.length; i++) {
					p[i]=(int)(Math.random()*21);
				}System.out.println(Arrays.toString(p)+ " ");	
				System.out.println("Introduce el numero que quieres cambiar");
				a=entrada.nextInt();
				System.out.println("Introduce el numero que quieres cambiar");
				b=entrada.nextInt();
					for(int i=0;i<p.length; i++) {
						if(p[i]==a) {
							p[i]=b;
							
						}System.out.print(p[i] +" ");
						
					}

	}
}
