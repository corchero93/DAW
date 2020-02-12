package Tema5Clase;
import java.util.Scanner;
public class Rectangulo {
public double x1,y1;
public double x2,y2;
public double perimetro;
public double altura;
public double base;
public double superficie;

public static final float PI = 3.1415f;
private static int NumRectangulos=0;
private String nombre;
public static final String nombreFigura = "Rectangulo";
Scanner p= new Scanner(System.in);
public Rectangulo(String nombre){
	NumRectangulos++;
	this.nombre =nombre;
}

public String getNombre() {
	return this.nombre ;
}
public int getNumRectangulos() {

return this.NumRectangulos;
}
public void setAltura(double e, double a){
	this.y1=e;
	this.y2=a;
	this.altura=y2-y1; 

}
public double getAltura() {
	return this.altura;
}

public void setBase(double g, double h) {
	this.x2=h;
	this.x1=g;
	this.base=x2-x1;
	
}
public double getBase() {
	return base;
}
public void setSuperficie() {
	superficie=this.base * this.altura; 
}
public double getSuperficie() {
	return superficie;
}
public void setPerimetro() {
	perimetro =(altura + base )*2;
}
public double getPerimetro() {
	return this.perimetro;
}
}
