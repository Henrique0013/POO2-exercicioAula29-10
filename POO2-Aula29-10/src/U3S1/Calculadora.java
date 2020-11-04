package U3S1;

/**
 * A classe calculadora é responsável por executar as operações matemáticas
 * básicas
 * 
 * @author Fabio Andrijauskas
 * @see java.lang.Math
 * @since 1.0
 */
public class Calculadora {
	/**
	 * O método ({@code somar} faz a soma de dois números
	 *
	 * @param a valor do primeiro número a ser somado.
	 * @param b valor do segundo número a ser somado.
	 * @return valor da soma de a e b
	 * @see Math
	 */
	public double somar(double a, double b) {
		return a + b;
	}

	/**
	 * O método ({@code subtrair} faz a subtração de dois números
	 *
	 * @param a valor do primeiro número a ser subtraido.
	 * @param b valor do segundo número a ser subtraido.
	 * @return valor da subtração de a e b
	 * @see Math
	 */

	public double subtrair(double a, double b) {
		return a - b;
	}

	/**
	 * O método ({@code dividir} faz a divisão de dois números
	 *
	 * @param a valor do primeiro número a ser dividido.
	 * @param b valor do segundo número a ser dividido.
	 * @return valor da divisão de a e b
	 * @see Math
	 */

	public double dividir(double a, double b) {
		return a / b;
	}

	/**
	 * O método ({@code multiplicar} faz a multiplicação de dois números
	 *
	 * @param a valor do primeiro número a ser multiplicado.
	 * @param b valor do segundo número a ser multiplicado.
	 * @return valor da multiplicação de a e b
	 * @see Math
	 */

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		double a = 4;
		double b = 2;

		double somar = calc.somar(a, b);
		double subtrair = calc.subtrair(a, b);
		double dividir = calc.dividir(a, b);
		double multiplicar = calc.multiplicar(a, b);

		System.out.println("Soma: " + somar);
		System.out.println("Subtrair: " + subtrair);
		System.out.println("dividir: " + dividir);
		System.out.println("multiplicar: " + multiplicar);

	}

}
