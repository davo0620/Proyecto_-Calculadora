package co.edu.uelbosque.swii.Calculadora2;

public class Multiplicacion implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.multiplicacion(a, b);
	}
	
	public static double multiplicacion(double n1, double n2) {
		return n1 * n2;
	}
	

}
