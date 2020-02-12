package programacion.Tema3.EjerciciosClase;

public class Primo {
	 int valor;
	 int coso;
	 boolean esPrimo=false;
	 public  Primo(){}
	 
	 public Primo(int coso) {
		 this.coso=coso;
		
	 }
	 public int esPrimo() {
		 for( int valor=2;valor< coso; valor++) {
			 	if(coso%valor==0) {
			 		esPrimo=false;
			 		System.out.print("Es un número no primo");
			 				break;
			 	}
			 	else if(coso==valor+1) {System.out.print("Es un número primo");
			 	}
			 	}
		return valor;
	 }
	 }

