package Tema3Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numero= new int[20];
		int [] cuadrado= new int[20];
		int [] cubo=new int[20];
		
		for(int i=0; i<numero.length; i++) {
			numero[i]=(int)(Math.random()*100);
			System.out.print(numero[i] +" ");
		}System.out.println();
		for(int i=0;i<cuadrado.length; i++) {
			cuadrado[i]=(int)(Math.pow(numero[i], 2));
			System.out.print(cuadrado[i] +" ");
		}System.out.println();
		for(int i=0; i<cubo.length;i++) {
			cubo[i]=(int)(Math.pow(numero[i],3));
			System.out.print(cubo[i] +" ");
		}
		
	}

}
