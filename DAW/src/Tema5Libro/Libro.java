package Tema5Libro;

public class Libro {

	private String titulo,autor;
	private int codigo;
	private boolean prestado;
	
	public Libro(){
		
	}
	
	public Libro(String titulo,String autor, int codigo, boolean prestado) {
		this.autor=autor;
		this.titulo=titulo;
		this.codigo=codigo;
		this.prestado=prestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public boolean prestar() {
		if(prestado== false) {
			this.prestado=false;
			System.out.println("El libro esta disponible");
			
		}else {
			System.out.println("El libo esta prestado");
			prestado = true;
					
		}return prestado;
	}
public boolean devolver(){
	if(prestado == false) {
		System.out.println("No lo puedes devolver");
		prestado=false;
		}
	else {
		System.out.println("Si puedes devolverlo");
		prestado=true;
	}
	return prestado;
	}
}
	


