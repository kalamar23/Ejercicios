import javax.swing.JOptionPane;

public class Ordenar3 {

	// Crear dos tablas de 10 numeros enteros y mezclar en una tercera en este
	// orden: el primero de A con el el ultimo de B,
	// el segundo de A con el penultimo de B

	public void ordenar() {

		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[10];

		for (byte i = 0; i < A.length; i++) {

			A[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese un numero A  (" + i + ")  :"));
			B[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese un numero B  (" + i + ")  :"));

		}
		for (byte i = 0; i < A.length; i++) {
			System.out.println();
			System.out.print("A[" + i + "] = " + A[i] + " ");
			System.out.print("B[" + i + "] = " + B[i]);
		}

		byte k = 0;
		byte i = 0;
		while (i < 5) {

			C[k] = A[i];

			C[k += 1] = B[4 - i];
			k++;
			i++;
		}

		for (byte j = 0; j < C.length; j++) {

			System.out.println("c[" + j + "] = " + C[j]);

		}

	}

	public static void main(String[] args) {
		// TODO Creacion de objetos

		Ordenar3 T = new Ordenar3();
		T.ordenar();
	}

}
