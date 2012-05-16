/** Uso de bucles while, do while y for
 */
import java.io.*;
public class Bucle2 extends Prompt {
// Ingreso de texto y muestra el texto con un bucle for
static void bucle1() throws IOException {

	for(int ch;(ch = System.in.read()) != 10;System.out.print((char) ch));
	
}
	
static void bucle2(){
int sqrt = 1, tarjet= 144;
	while(++sqrt * sqrt != tarjet);
	System.out.println("Raiz ("+tarjet+" )" + " = " +sqrt);
}
// Uso de while usando sentencia (cuerpo) y sin cuerpo solo, para cambiar valor si la condición se cumple
static void bucle3(){
	int valor1 = 1, valor2 = 5;
	while(valor1 < 20 && (valor2 = 10) != 0){
		valor2 = 30;
		System.out.println("El valor es = " +valor2);
		break;
	}
	System.out.println("El valor es = " +valor2);	
}
// Uso de for con distintas expresiones 
static void bucle4(){
	
	for(int loop_index = 0, doubled = 0 ;loop_index <= 10;loop_index++,doubled = 2 * loop_index ) {
	
	System.out.println("El doble del indice " + loop_index + " es = " + doubled );
	}
	}

// Recorre un array buscando un dato, cuando encuentra el dato termina el bucle 
	static void bucle5(int mod, int numero) {
		int[][] ceduIDs = { { 23, 5, 56, 16, 5, 29, 144 },
				{ 47, 7, 30, 89, 4, 19, 120 } };

		int ID = numero;
		boolean found = false;

		for (int i = 0; i < ceduIDs[mod].length; i++) {

			if (ceduIDs[mod][i] == ID) {

				found = true;
				break;
			}
		}
		prompt(found, ID, mod);
	}

	public static void main(String[] args) throws IOException {
		// Creacion de objetos y desarrollo bucle1();bucle2(); bucle3();	bucle4();
	bucle5(0, 144);
	
	}

}
