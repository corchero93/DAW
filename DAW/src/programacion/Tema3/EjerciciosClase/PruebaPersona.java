package programacion.Tema3.EjerciciosClase;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona ("Javi",27, 1.93f);
		System.out.println("el nombre es "+p1.nombre+ " su edad es " +p1.edad+ " su altura es "+p1.altura);
		p1.cambia_Nombre("Juan");
		System.out.println(p1.nombre);
		Persona p2= new Persona("Alberto",35,1.75f);
		System.out.println("el nombre es "+p2.nombre+ " su edad es " +p2.edad+ " su altura es "+p2.altura);
		Persona p3= new Persona("alex",26,1.68f);
		System.out.println("el nombre es " +p3.nombre+ " su edad es "+p3.edad+ " su altura es " +p3.altura);
		
	}
			
}