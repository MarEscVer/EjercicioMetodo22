package unico;

public class Ejercicio22 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que indique qué dígitos contiene el número que el usuario
		 * indique, así como cuáles no contiene. Para ello implemente el método
		 * contieneDigito que devuelve un valor booleano indicando si un número, pasado
		 * como parámetro contiene o no un determinado dígito. Este sería su prototipo:
		 * public static boolean contieneDigito(int numero, int digito) Introduzca un
		 * número entero: 67706 Dígitos que aparecen en el número: 0 6 7 Dígitos que no
		 * aparecen: 1 2 3 4 5 8 9
		 */

		final int TOPE = 9;
		int numero;
		int digito;
		boolean valorDigito;
		String aparecen = " ";
		String noAparecen = " ";

		numero = Util.leerInt("Introduzca un número: ");

		while (numero > 0) {
			digito = numero % 10;
			for (int i = 0; i <= TOPE; i++) {
				valorDigito = contieneDigito(numero, i);
				if (valorDigito) {
					aparecen += i + " ";
				} else {
					noAparecen += i + " ";
				}
			}
			numero = numero / 10;
		}

		Util.escribirLn("Dígitos que aparecen en el número:" + aparecen);
		Util.escribirLn("Dígitos que no aparecen:" + noAparecen);
	}

	public static boolean contieneDigito(int numero, int digito) {
		boolean cont_digito;
		String digitoCadena = String.valueOf(digito);
		String numeroCadena = String.valueOf(numero);
		
		cont_digito = numeroCadena.matches(digitoCadena);

		return cont_digito;
	}
}
