package programacion.Tema3.EjerciciosClase;

public class Cuenta {

		public String num_Cuenta;
		public double saldo;
		
		public Cuenta() {
			for(int i=0; i<10; i++) {
				num_Cuenta= num_Cuenta +Integer.toString(((int)Math.random()*10));
			}
		}
			public Cuenta(double saldo){
				for(int i=0; i<10; i++){
					num_Cuenta= num_Cuenta +Integer.toString(((int)Math.random()*10));
				}
				this.saldo=saldo;
			}
			public void cargo(double dinero){
				this.saldo-=dinero;
			}
			public void ingreso(double dinero){
				  this.saldo+=dinero;
			}
			public String getNumCuenta() {
				return this.num_Cuenta;
			}
			public void transferencia(Cuenta c, double dinero) {
				this.saldo-= dinero;
				c.ingreso(dinero);
			}
		}
		
		

