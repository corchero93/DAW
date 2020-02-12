package programacion.Tema3.EjerciciosClase;

public class Pizza {
	public static int totalPedidas=0;
public int totalServidas=0;
public String tam;
public String tipo;
public String estado;
	public Pizza() {}
public Pizza(String tam, String tipo ) {
	this.tam=tam;
	this.tipo=tipo;
	this.estado="Pedida";
	this.totalPedidas++;
}
	public int getPedidas() {
		return this.totalPedidas;
	}
	public void despachar() {
		if (this.estado == "pedida") {
			this.estado = "servida";
			totalServidas++;
		}
	}
}