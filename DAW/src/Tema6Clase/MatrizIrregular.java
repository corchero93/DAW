package Tema6Clase;

public class MatrizIrregular {

	public static void main(String[] args) {
		int [][] m3={
						{1,2,3,4,5},
						{2,3,4},
						{2,3},
						{2}
		};
		for(int i=0;i<m3.length;i++) {
			for(int j=0; j<m3[i].length;j++) {
				System.out.print(m3[i][j] + "  ");
			}System.out.println();
		}
	}
		
	}

