import javax.swing.*;

public class Ordenar2 {

	// Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera,
	// y a continuación los elementos
	// impares

	public void ordenar() {

		int[] leer = new int[10];
		int[] ordena = new int[10];

		for (byte i = 0; i < leer.length; i++) {

			leer[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese un numero : "));
		}
		byte k = 0;
		byte v = 0;
		while (v < 2) {
			for (byte i = 0; i < ordena.length; i++) {
				if (v == 0) {
					if (leer[i] % 2 == 0) {
						ordena[k] = leer[i];
						k++;
					}
				}
				if (v == 1) {
					if (leer[i] % 2 != 0) {
						ordena[k] = leer[i];
						k++;
					}
				}
			}
			v++;
		}
		for (byte i = 0; i < ordena.length; i++) {
			System.out.println("ordena [" + i + "] = " + ordena[i]);

		}

	}

	/*
	 * Leer por teclado dos tablas de 10 números enteros y mezclarlas en una
	 * tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de
	 */

	public void mezclar() {

		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];

		for (byte i = 0; i < a.length; i++) {

			a[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese un numero : "));
			b[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese otro numero : "));
		}

		for (byte i = 0; i < a.length; i++) {
			System.out.println();
			System.out.print("a[" + i + "] = " + a[i] + " ");
			System.out.print("b[" + i + "] = " + b[i]);

		}

		byte m = 0;
		byte k = 0;
		while (m < 5) {

			c[k] = a[m];
			c[k += 1] = b[m];
			if (k == 9)
				break;
			k++;
			m++;
		}

		for (byte j = 0; j < c.length; j++) {

			System.out.println("c[" + j + "] = " + c[j]);
		}

	}

	public static void main(String[] args) {

		Ordenar2 T = new Ordenar2();

		T.mezclar();

	}

}
