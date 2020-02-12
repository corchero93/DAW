package Tema6Clase;

public class clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String c="1234,5678";
double n;
try {
	n=Double.valueOf(c).doubleValue();
}catch(NumberFormatException e)
{
	System.out.println(e);
	System.out.println("casca");
}
	}

}
