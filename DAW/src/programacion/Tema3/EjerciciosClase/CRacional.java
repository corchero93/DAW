package programacion.Tema3.EjerciciosClase;

public class CRacional {

	int numerador;
	int denominador;
	
	public CRacional() {}
	
	public CRacional (int numerador, int denominador) {
	this.numerador=numerador;
	this.denominador=denominador;
	
	}
	
	void asignarDatos(int num, int den) {
		numerador=num;
	    numerador = num;

	    if (den == 0) den = 1;

	    denominador = den;

	   	}
	void visualizarRacional()

	  {

	    System.out.println(numerador + "/" + denominador);

	  }

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
}
