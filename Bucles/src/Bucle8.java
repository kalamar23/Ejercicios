/** Uso de bucles while, do while y For con ejercicios (anidados)
 */
import java.io.*;

public class Bucle8 extends Print {

// BufferedReader
	static String read() throws IOException {
	String s1;	
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	s1 = S.readLine();	
		return s1;
	}
//	Calcular el factorial de un numero, mediante subprogramas.
	static void iniFactorial() throws IOException {
		int numero;

		System.out.println("Ingrese un numero para calcular su factorial : ");
numero = Integer.parseInt(read());	
if(numero > 0) {
cuerPrimo(numero);
}
else {
			System.out.println("No tiene factorial");
}	
}
static void cuerPrimo(int numero)	{
	
	int temp, factorial = 1;
	temp = numero; 
while(temp > 0) {
	factorial *= temp--;
}
System.out.println(numero +"! = " + factorial);
}
// Hacer un programa que calcule independientemente la suma de los pares y los impares de los numeros entre 1 y 1000, 
// utilizando un switch.
static void suma() throws IOException {
	int op;
	do {
	System.out.println("Desea la suma de numeros 1) pares o 2) impares, desde 1 a 1000 : ");
op = Integer.parseInt(read()); 
	}
	while(op != 1 && op != 2);
switch(op){
case 1 : sumaPares();break;
case 2 : sumaImpares();break;
}
}
static void sumaPares(){
int suma = 0;
for(int conta = 2;conta <= 1000; conta++){
	if(conta % 2 == 0)
		suma++;
}
System.out.println("La suma de numeros pares de 1 a 1000 es : " +suma);
}
static void sumaImpares(){
int suma = 0;
for(int conta = 1;conta <= 1000; conta++){
	if(conta % 2 != 0)
		suma++;
}
System.out.println("La suma de numeros impares de 1 a 1000 es : " +suma);

}

// Introducir una frase por teclado. Imprimirla cinco veces en filas consecutivas, pero cada impresion ir  desplazada 
// cuatro columnas hacia la derecha.
static void frase() throws IOException {
String s1;
	
	System.out.println("Ingrese una frase : ");
	s1 = read();
	StringBuffer s2 = new StringBuffer(s1);
int veces = 0;
while (veces < 5){
	
	System.out.println(s2.insert(0, "     "));
	System.out.println();
	veces++;
}
}

// Comprobar si un numero mayor o igual que la unidad es primo.
static void primo() throws IOException {
	int numero,contador = 2;
	boolean primo = true;
	System.out.println("Ingrese un numero : ");
	numero = Integer.parseInt(read());
while((primo) && contador < numero){
	
	if(numero % contador == 0)
		primo = false;
	contador++;
}
System.out.println((primo) ? "El numero " + numero + " es primo !" : "El numero " + numero + " no es primo !");
}

public static void main(String[] args) throws IOException {
		// Creacion de objetos iniFactorial(); suma(); frase();

primo();
}

}
