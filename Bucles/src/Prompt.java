import java.io.*;
public class Prompt {

	// Creacion de un prompt para el metodo que le sigue
	static void prompt(boolean found, int ID, int mod){

			if (mod == 0) {
				System.out.println((found) ? "El usuario con ID " + ID
						+ " se encuentra en este modulo sistema (modulo 1)"
						: "El usuario no se encuentra en este modulo (modulo 1)");
			} else if (mod == 1) {
				System.out.println((found) ? "El usuario con ID " + ID
						+ " se encuentra en este modulo (modulo 2)"
						: "El usuario no se encuentra en este modulo (modulo2)");
			}
	}

	public static void main(String[] args) throws IOException {
		
		
	}
	
	
}
