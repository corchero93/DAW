package programacion.Tema3.EjerciciosClase;

public class Cilindro {
	public static double h;
	public static double r;
	public static double volumen;
	public Cilindro() {}
	public static double volumenCilindro(double h, double r) {
		volumen=h* Math.PI * Math.pow(r, 2);
		return volumen;
	
	}
}