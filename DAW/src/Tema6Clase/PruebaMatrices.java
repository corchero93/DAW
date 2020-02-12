package Tema6Clase;

public class PruebaMatrices {
	
		public static void main(String[] args) {
			int[][] m1= {
					{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}
			};
			int [][] m2= new int[4][3];
			
			for(int i=0; i<m1.length;i++) {
				for(int j=0; j<m1[i].length; j++) {
					System.out.print(m1[i][j] +"  ");
			
				}
				System.out.println();
				
			}

			for(int i=0; i<m2.length;i++) {
				for(int j=0; j<m2[i].length; j++) {
					m2[i][j]=(int)(Math.random()*10);
					System.out.print(m2[i][j] + "  ");
				}
				System.out.println();
}
			}
}