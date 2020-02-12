package Tema5Clase;

public class PruebaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangulo r1 = new Rectangulo("rect1");
			System.out.println(r1.getNumRectangulos());
			System.out.println(r1.getNombre());
			Rectangulo r2 = new Rectangulo("rect2");
			System.out.println(r2.getNumRectangulos());
			System.out.println("Esta es la altura");
			r2.setAltura(6,9);
			System.out.println(r2.getAltura());
			r2.setBase(0, 3);
			System.out.println("Esta es la base");
			System.out.println(r2.getBase());
			
			r2.setSuperficie();
			System.out.println("Esto es la superficie");
			System.out.println(r2.getSuperficie());
			
			r2.setPerimetro();
			System.out.println("Este es el perimetro");
			System.out.println(r2.getPerimetro());
			
	}

}
