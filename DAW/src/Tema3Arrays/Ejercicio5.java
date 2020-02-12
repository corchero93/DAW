package Tema3Arrays;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner entrada=new Scanner(System.in);
				int [] ma= new int[10];
				for(int i=0; i<ma.length;i++) {
					System.out.println("Introduce tu numero puta");
					ma[i]=entrada.nextInt();
					
				}
				
					int max=ma[1], minimo=ma[2];
				for (int i=0 ;i<ma.length;i++) {
					if(ma[i]>max) {
						max=ma[i];
					}
					if(ma[i]<minimo) {
						minimo=ma[i];
					}
				}
				System.out.println("el max es "+max+ " El minino es "+minimo);
	}

}
