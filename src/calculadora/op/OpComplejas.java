package calculadora.op;

public class OpComplejas {
	
	public String raiz(float num1) {
		return String.valueOf(Math.sqrt(num1));
	}
	
	public String potenciaCuadrada(float num1) {
		return String.valueOf(num1 * num1);
	}
	
	public String potencia(float num1, float num2) {
		return String.valueOf(Math.pow(num1, num2));
	}
	
	public String modulo(float num1, float num2) {
		return String.valueOf(num1 % num2);
	}
}
