package Grupo;

import java.util.Scanner;
public class posicionDeDigito {
	Scanner entrada =new Scanner(System.in);	 
	 String num;
	 int i;
	 int cifra;
	public posicionDeDigito() {
	 System.out.print("ingrese su numero");
	num= entrada.next();
	System.out.print("Dime un numero");
		cifra=entrada.nextInt();
		for (i=0; i < num.length(); i++) {
			char c=(char) cifra;
			System.out.println(num.charAt(i));
			if(num.indexOf(c) >-1) {
			
	System.out.println(c);
	}
		}
	}
}
	

