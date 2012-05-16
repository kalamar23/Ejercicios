/** Reduccion de ejercicio
 */
import java.io.*;
public class Redu extends Print {
static char op;
	//bufferedreader
	static String read() throws IOException {
	
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
return  S.readLine();
	
	}
	
	static void calculo() throws IOException {
int numero,op1;
		System.out.println("Ingrese un numero : ");		
	numero = Integer.parseInt(read());
System.out.println("Ingrese una opcion : ");
Print3("1) Sumar");
Print3("2) cerrar");
op1 = Integer.parseInt(read());
switch(op1){
case 1 : sumar(numero);break;
case 2 : close(); break;
}
	}

	
static void sumar(int numero) throws IOException {
	int valor1 = 15;
	
System.out.println(numero + " + " + " 15 = " + (numero + valor1));
Print3("Ingrese una y para continuar o n para cerrar : ");
String s1 = read();
Redu.op = s1.charAt(0);

switch (op){

case 'y' : calculo();break;
case 'n' : close(); break;
}

}

static void close(){
	Print3("Fin del programa");
}
	public static void main(String[] args) throws IOException {
		// Creacion de objetos
calculo();
	}

}
