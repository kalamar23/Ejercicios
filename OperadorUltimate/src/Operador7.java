/** Uso de While 
*/
import java.io.*;
public class Operador7 {
// Uso de break para terminar un loop infinito
	static void ope1() throws IOException {
		
		while(true){
			char ch;
			System.out.println("Ingrese c o C para continuar : ");
			ch = (char) System.in.read();
			if(ch == 'c' || ch == 'C')
				break;	
		}
		
		
	}
// Se busca un dato dentro del array y cuando se encuentra cambia el estado boolean y termina (break) el bucle.
	//uso de operador ternario para informar que el dato se encuentra
	static void ope2(){
		int [] tarjetIDs = {23, 5, 89, 155, 15, 19};
		
	int tarjetID = 154;
	boolean found = false;
	for(int i = 0; i < tarjetIDs.length;i++){
		if(tarjetIDs[i] == tarjetID){
			found = true;
			break;
			
		}
		
		
		
	}
	System.out.println((found) ? "Empleado " + tarjetID + " Existe en el sistema" : " No existe el empleado");	
		
	}
static void ope3() throws IOException {
	int ch;
	while((ch = System.in.read()) != 10){
		System.out.print((char) ch);
		
	}

	
}

static void ope4(){
	int valor1 = 20;
	int valor2 = 10;
	if(valor1 < 20 && (valor2 = 5) == 0){}
		System.out.println(valor2);
	
	
}

static void ope5(){
	int valor1 = 32;
			String hex = Integer.toHexString(32);	
System.out.println(hex);
}
public static void main(String[] args) throws IOException {
		// Creacion de objetos 
		//ope1();	ope2();ope3();ope4(); 
	ope5();
}

}
