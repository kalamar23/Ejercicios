/** Uso de while
 */
import java.io.*;
import java.util.*;

public class Operador8 {
	// Uso de while para convertir entero a hexadecimal
	static void ope1() {
		int valor1 = 60, temp = valor1;
		// 00000000000000000000000000100000 = 32 representacion binaria
		// complemento a dos
		StringBuffer sb = new StringBuffer();
		Stack st = new Stack();

		while (temp > 0) {

			st.push(String.valueOf(temp % 16));
			temp >>>= 4;
		}

		while (!st.empty()) {
			sb.append(new String((String) st.pop()));
		}

		System.out.println("La conversion de " + valor1 + " es 0x" + sb);
	}

	// Determinar si un numero es primo usando el operador modulo %
	static boolean ope2(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			System.out.println(numero + " % " + contador + " "
					+ (numero % contador) + " " + primo);
			contador++;

		}
		System.out.println(primo);
		return primo;
	}

	static void ope3() {
		int sqrt = 1, tarjet = 144;
		while (++sqrt * sqrt != tarjet)
			;
		System.out.println(sqrt);
	}

	// metodo para calcular factorial de un numero - usando comando while
	static void ope4(int numero) {
		int factorial = 1, temp = numero;
		while (temp > 0) {

			factorial *= temp--;

		}

		System.out.println(numero + "!" + " = " + factorial);
	}

	static void ope5(int numero) {
		int most = numero, factorial = 1;
		while ((factorial *= numero--) > 0 && (numero > 0))
			;

		System.out.println(most + "!" + " = " + factorial);

	}

	// metodo para convertir de decimal a binario
	static void ope6(int valor1) {
		int temp = valor1;
		StringBuffer sb = new StringBuffer();
		Stack st = new Stack();
		while (temp > 0) {
			// parse a String
			st.push(String.valueOf(temp % 2));
			temp >>= 1;
		}
		while (!st.empty()) {
			sb.append(new String((String) st.pop()));
		}
		System.out.println("El numero " + valor1 + " en binario es :" + sb);

		while (sb.length() != 32) {
			sb.insert(0, '0');
		}
		System.out.println("El numero " + valor1
				+ " en binario complemento a dos es :" + sb);
	}

	static void ope7() throws IOException {
		int ch;
		while (true) {
			System.out.println("Ingrese y o una Y para continuar : ");
			ch = System.in.read();
			if (ch == 'y' || ch == 'Y')
				break;
		}

	}

	// Verificar si un numero es impar - con operador modulo
	static void ope8(int numero) {
		boolean impar = false;
		if (numero % 2 == 0)
			impar = true;
		System.out.println((impar) ? "El numero es par !"
				: "En numero es impar");
	}

	// Uso de do while
	static void ope9() {
		int valores[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, test = 5, index = 0;

		do {
			test *= valores[index++];
			System.out.println(test);
		}

		while (test < 15);

	}

	// diferencia entre do while y while
	static void ope10() {
		int valor1 = 0;
		try {
			do {
				System.out.println("El reciproco es = " + (1 / valor1));
			}

			while (valor1 > 0);
		} catch (ArithmeticException ex) {

			System.out.println("No puede dividir por cero");

		}
	}

	public static void main(String[] args) throws IOException {
		// creacion de objetos ope1();ope2(9);ope3();ope4(6); ope5(6);
		// ope6(10);ope7();ope8(6);ope9();
		ope10();

	}

}
