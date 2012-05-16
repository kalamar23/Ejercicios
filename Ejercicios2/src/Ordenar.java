import javax.swing.JOptionPane;

public class Ordenar {

	// Diseñar un programa que muestre el producto de los 10 primeros números
	// impares

	public void numeros() {
		int multi = 1;
		byte count = 0;
		for (byte numero = 1; numero < 21 && count < 10; numero++) {

			if (numero % 2 != 0) {

				multi *= numero;
				count++;
				System.out.println("Numero impar : " + numero);
			}

		}

		JOptionPane.showMessageDialog(null,
				"El producto de los 10 primeros numeros impares es : " + multi);

	}

	public static void main(String[] args) {

		Ordenar T = new Ordenar();

		T.numeros();
	}

}
