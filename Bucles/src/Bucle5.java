import java.io.*;
import java.io.DataInputStream;
public class Bucle5 extends Print {
// Imprimir los numeros que sean pares hasta 100
	static void bucle1() {
		int contador = 2;
		while (contador <= 100) {

			if (contador % 2 == 0) {
				System.out.println("El numero " + contador + " es par");
			}
			contador++;
		}
	}
// sumar los 100 primeros numeros
	static void bucle2(){
		int suma = 0;
for(int contador = 1;contador <= 100;suma += contador++);	
		
		System.out.println("La suma de los 100 primeros numeros es : " +suma);
		
	}
// Debe imprimir los numeros imparares que hay de 1 a 100 y cuantos son
	static void bucle3(){
	int contador = 1, nuImpares = 0;
	while (contador <= 100 ){
		if(contador % 2 != 0){	
	System.out.println("El numero " + contador + " es impar");	
	nuImpares++;
		}			
		contador++;		
	}

	System.out.print("De 1 a 100 existen " + nuImpares + " numeros impares");		
		
	}
// imprime los numeros naturales que existen hasta un numero entregado por teclado
	static void bucle4(int numero){
int temp = numero, contador = 1;
while(contador <= temp){
		System.out.println(contador++);		
}
}
// introducir tantas frases como queramos y contarlas
	static void bucle5() throws IOException {
BufferedReader S = new BufferedReader(new InputStreamReader(System.in));		
System.out.println("Ingrese las frases que desea que el programa cuente (escriba Exit para terminar) : ");
int contador = 0;
for(String frase;(frase = S.readLine()) != null;contador++){
if(frase.equals("exit")){
	System.out.println("El numero de frases ingresadas es : " +contador);
	break;
}
}
	}
// Solo permite introducor S y N
static void bucle6() throws IOException {
	char ch = ' ';
while(ch != 'S' && ch != 'N'){
	
	System.out.println("Ingrese una S o una N para continuar : ");
	ch = (char) System.in.read();
}
System.out.println("Bienvenido !!! ");	
}

// introducir un numero por teclado, que diga si es par o impar
static void bucle7() throws IOException {
System.out.println("Ingrese el numero a calcular : ");
BufferedReader S = new BufferedReader(new InputStreamReader(System.in));

int numero = Integer.parseInt(S.readLine());	
	if(numero % 2 == 0){
System.out.println("El numero es par");
	}
	else {
		System.out.println("El numero es impar");
		
	}
}

// ingrese un numero por teclado, indica si es positivo o negativo
static void bucle8() throws IOException {
	
Print3("Ingrese un numero para continuar : ");	
BufferedReader S = new BufferedReader(new InputStreamReader(System.in));

int numero = Integer.parseInt(S.readLine()); 
	System.out.println(numero);
	if(numero > 0){
		Print3("el numero es positivo !");
	}
	
	else if(numero < 0) {
		Print3("el numero es negativo !");

	}
	
}



public static void main(String[] args) throws IOException {
		// Creacion de objetos bucle1(); bucle2(); bucle3();	bucle4(10); bucle5();	bucle6();bucle7();	

}

}
