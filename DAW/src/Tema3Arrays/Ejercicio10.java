package Tema3Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada= new Scanner(System.in);
		int [] foca= new int [20];
		int[] derecha=new int[20];
		
		for(int i=0; i<foca.length; i++) {
			foca[i]=(int)(Math.random()*101);
			}System.out.println(Arrays.toString(foca));
		
				for(int i=0; i<foca.length;i++) {
			if(foca[i]%2==0) {
			System.out.print(foca[i]);	
			}
		}
	}
	}



