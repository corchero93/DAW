package programacion.Tema3.EjerciciosClase;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cuenta c1 = new Cuenta();
			System.out.println(c1.getNumCuenta());
			
			Cuenta c2 = new Cuenta(1400);
			c1.ingreso(2000);
			
			System.out.println("cuenta c1: " + c1.saldo + " " + "cuenta c2:" + c2.saldo);
			c1.transferencia(c2, 500);
			System.out.println("cuenta c1: " + c1.saldo + " " + "cuenta c2:" + c2.saldo);
			
	}

}
