package programacion.Tema3.EjerciciosClase;

public class Persona {
	String nombre;
	int edad;
	float altura;
	String consulta_Nombre() {
		return nombre;
	}
	 void cambia_Nombre(String nom) {
		nombre=nom;
	}
	public Persona() {
		
	}
	public Persona(String n, int ed, float alt) {
		nombre=n;
		edad=ed;
		altura=alt;
	}
}
