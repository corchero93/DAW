package Tema6Clase;

public class MatrizAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m4= new int[4][];
		m4[0]=new int[4];
		m4[1]=new int[5];
		m4[2]=new int[3];
		m4[3]=new int [5];
	for(int i=0; i<m4.length;i++) {
		for(int j=0; j<m4[i].length; j++) {
			m4[i][j]=(int)(Math.random()*10);
			System.out.print(m4[i][j] + "  ");

}System.out.println();
}
	}}