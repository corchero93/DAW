package programacion.Tema3.EjerciciosClase;

public class PruebaIndividuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individuo i1= new Individuo("Daniel", "112233a", 30); 
	System.out.println(i1.getDni());
	i1.setDni("77777777D");
	System.out.println(i1.getDni());
	System.out.println(i1.getNombre());
	i1.setNombre("Ana");
	System.out.println(i1.getNombre()); 
	
		}
	}


