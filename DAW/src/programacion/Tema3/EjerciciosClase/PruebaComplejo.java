package programacion.Tema3.EjerciciosClase;

public class PruebaComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo c1= new Complejo();
		Complejo c2= new Complejo(1.2, 2.7);
		
		System.out.println(c1.real +" "  +c1.imag);
		System.out.println(c2.real +" " +c2.imag);
		
		c1.cambiar_Real(7.7);
		c1.cambiar_Imag(10.3);
		System.out.println(c1.real +" "  +c1.imag);
		System.out.println(c2.real +" "  +c2.imag);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c1.sumar(c2);
		System.out.println(c1.toString());
	}

}
