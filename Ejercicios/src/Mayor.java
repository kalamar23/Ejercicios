import javax.swing.*;


public class Mayor {
	// Generar un array de enteros aleatorios de dos digitos y ordenar de menor a mayor
	public void mayor() {
		int ran = 98, numero, mayor = 0;
		int[] valores = new int[10];
		for (int i = 0; i < valores.length; i++) {
			while (valores[i] == 0) {
				numero = (int) (Math.random() * ran);
				if (numero > mayor && ((numero - mayor)) < 20) {
					mayor = numero;
					valores[i] = numero;
				}
			}
			System.out.println(valores[i]);
		}
	}
		
	public static void main(String[] args) {
		// TODO Creacion de objetos
Mayor ma = new Mayor();
ma.mayor();
		
	}

}
