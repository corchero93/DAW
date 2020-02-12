package programacion.Tema3.EjerciciosClase;

public class Individuo {

		String dni;
		String nombre;
		int año;

public Individuo(){}

public Individuo(String nombre,String dni,int año) {
	this.nombre= nombre;
	this.dni=dni;
	this.año=año;
}
public String getDni() {
	return dni;
}
public void setDni(String dni){
	this.dni=dni;
}public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre= nombre;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año=año;
}
}
























