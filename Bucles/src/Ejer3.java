/** Ejercicios
 */
import java.io.*;
public class Ejer3 extends Print {

	// Reader
static String read() throws IOException {
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader S = new BufferedReader(is);
	
	return S.readLine(); 	
}
	
// Uso de continue en un bucle For
static void bucle1() throws IOException {
	for(int i = 5; i > -5;i--){
		if(i == 0) continue ;
System.out.println("El inverso de " + i + " = " + (1/i));		
	}
char op;
	Print3("Ingrese una y para continuar y n para detener : ");
	op = (char) System.in.read();
switch(op){
case 'y' : bucle2();break;
case 'n' : obtener(); break;
}
}

// Uso de break para terminar bucle
static void bucle2() throws IOException {
char ch;
while(true){
	
	System.out.println("Ingrese una c o una C para continuar : ");
	ch = (char) System.in.read();
	if(ch == 'c' || ch == 'C' ) break;
		
}
	
	
	
}

// Obtener un caracter con System.in
static void obtener() throws IOException {
	int op;
	Print3("Ingrese 1 o 2 : ");
	op = Integer.parseInt(read());
switch(op){
case 1 : bucle1();break;
case 2 : bucle2(); break;
}
}

public static void main(String[] args) throws IOException {
		// Creacion de objetos bucle1(); bucle2();	
obtener();
}

}
