package Tema6Clase;

public class PruebaArrays1 {
	
	
		static int sumaarray(int[] j) {
			int suma=0;
			for (int i=0;i<j.length;i++) {
				suma=suma +j[i];
				
			}
			return suma;
			}
			static int[] sumaArray2(int[] j) {
				int[] m2= new int[j.length];
				for(int i=0; i<j.length;i++) {
					m2[1]=j[i];
					
				}return m2;
			}
			public static void main(String[] args){
				//int [] m= {1,2,3};
				//System.out.println(sumaarray(m));
				
				
				PruebaArrays3[] p= new PruebaArrays3[10];
				for (int i=0;i<p.length; i++) {
					p[i]=new PruebaArrays3(i+1,i+2);
				}
				for(int i=0; i<p.length;i++) {
					p[5].impreX();
					p[5].impreY();
				}
		}
		
		
}