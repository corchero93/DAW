package Tema5Libro;

public class PruebaLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Libro l1= new Libro("El señor de los anillos", "JRR Tolkien",195,true);
System.out.println(l1.getAutor()+"," + l1.getTitulo()+","+ l1.getCodigo());
System.out.println(l1.prestar());
System.out.println(l1.devolver());
	}

}
