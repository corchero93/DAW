package programacion.Tema3.EjerciciosClase;

public class Circulo {
	public static final double PI = 3.254;
	private double radio;
	public Circulo() {
		this.radio=2;
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double calcularSuperficie() {
		return  radio * radio * Math.PI;
	}
	
}
