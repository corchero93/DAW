
public class Ejercicio10 {

	 public static void main(String[] args) {
		  
		    int[] n = new int[20];
		    int[] par = new int[20];
		    int[] impar = new int[20];
		    int pares = 0;
		    int impares = 0;
		    for(int i=0; i<20;i++) {
		    	n[i]=(int)(Math.random()*101);
		    	System.out.print(n[i] + " ");
		    	//Indicamos si son pares o no
		    	if(n[i] % 2==0) {
		    		par[pares++]=n[i];
		    	}else
		    		impar[impares++]=n[i];
		    }System.out.println();
		 //introducimos los pares en la array
		    for(int i=0; i<pares;i++) {
		    	n[i]=par[i]; 
		    } //Introducimos los impares en la array e indicamos que se empiecen a ponerse al final de la array
		    for(int i=pares; i<20;i++) {
		    	n[i]=impar[i- pares];
		    }
		    for(int i=0; i<20;i++) {
		    	System.out.print(n[i] + " ");
		    }
	 }
}