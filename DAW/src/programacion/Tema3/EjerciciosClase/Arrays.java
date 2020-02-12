package programacion.Tema3.EjerciciosClase;

public class Arrays {
	public static void printStringArray(String [] str) {
		for(int i=0; i<str.length; i++) {
		System.out.print(str[i] + " ");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[ ] array= new String[3];
		array[0]= "ab";
		array[1]= "cd";
		array[2]="ef";
		
		printStringArray(array);
		printStringArray(new String[] {"gh", "ij","kl"});

		int[] v1= {1,2,8};
		printInt(return2xarray(v1));
	}
	public static  int[] return2xarray(int[] array) {
		int[] aux=new int[array.length];
			for(int i = 0;i<array.length; i++) {
				aux[i]= 2* array[i];
				
			}
			return aux;
	}
	public static void printInt(int [] str) {
		for(int i=0; i<str.length; i++) {
		System.out.print(str[i] + " ");
		}
	
	}
	
	
}
	
