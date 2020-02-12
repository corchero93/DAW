package Tema5Clase;
import java.util.Scanner;
public class Dni {
	private int numDni;
	private String sDni;
	char letra;
	private static String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
	public int q;
	boolean valido;
	Scanner p= new Scanner(System.in);
	public Dni(){
		
		System.out.println("Introduce tus numeros");
		numDni=p.nextInt();
		
	}
	public int obtenerDni() {
		
		return numDni;
	}
	public String obtenerNif() {
		int i =(numDni) % 23;
		String numDni2=Integer.toString(numDni);
		letra=secuenciaLetrasNIF.charAt(i);
		sDni=numDni2+"-"+letra;
		
		return this.sDni;
	}
	public void establecersNif(String sDni) {
		
	}
	public void establecerDn(int numDni) {
		
	}
	

}
	
