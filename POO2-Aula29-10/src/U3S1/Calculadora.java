package U3S1;

/**
 * A classe calculadora � respons�vel por executar as opera��es matem�ticas
 * b�sicas
 * 
 * @author Fabio Andrijauskas
 * @see java.lang.Math
 * @since 1.0
 */
public class Calculadora {
	/**
	 * O m�todo ({@code somar} faz a soma de dois n�meros
	 *
	 * @param a valor do primeiro n�mero a ser somado.
	 * @param b valor do segundo n�mero a ser somado.
	 * @return valor da soma de a e b
	 * @see Math
	 */
	public double somar(double a, double b) {
		return a + b;
	}

	/**
	 * O m�todo ({@code subtrair} faz a subtra��o de dois n�meros
	 *
	 * @param a valor do primeiro n�mero a ser subtraido.
	 * @param b valor do segundo n�mero a ser subtraido.
	 * @return valor da subtra��o de a e b
	 * @see Math
	 */

	public double subtrair(double a, double b) {
		return a - b;
	}

	/**
	 * O m�todo ({@code dividir} faz a divis�o de dois n�meros
	 *
	 * @param a valor do primeiro n�mero a ser dividido.
	 * @param b valor do segundo n�mero a ser dividido.
	 * @return valor da divis�o de a e b
	 * @see Math
	 */

	public double dividir(double a, double b) {
		return a / b;
	}

	/**
	 * O m�todo ({@code multiplicar} faz a multiplica��o de dois n�meros
	 *
	 * @param a valor do primeiro n�mero a ser multiplicado.
	 * @param b valor do segundo n�mero a ser multiplicado.
	 * @return valor da multiplica��o de a e b
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
