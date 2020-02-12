package programacion.Tema3.EjerciciosClase;

public class Complejo {

		double real;
		double imag;
public Complejo() {
	real=0.0d;
	imag=0.0d;
}
public Complejo(double real, double imag) {
	this.real=real;
	this.imag=imag;
	
}
public double consulta_Real() {
	 return real;
}
public double consulta_Imag() {
	return imag;
}
public void cambiar_Real(double real) {
	 this.real=real;
}

public void cambiar_Imag(double imag) {
	 this.imag=imag;
}

public String toString() {
	String str= real + " + "  + imag + "i";
	return str;
}

public void sumar(Complejo b) {
	this.real+=  b.real;
	this.imag+=  b.imag;
}
public double getReal() {
	return real;
}
public void setReal(double real) {
	this.real = real;
}
public double getImag() {
	return imag;
}
public void setImag(double imag) {
	this.imag = imag;
}
}
