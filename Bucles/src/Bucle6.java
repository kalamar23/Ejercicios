/** Uso de bucles y ejercicios
 */
import java.io.*;
public class Bucle6 extends Print {
// BufferedReader
	static String read() throws IOException {
	String s1;	
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	s1 = S.readLine();	
		return s1;
	}
// Imprimir los multiplos de 3 que existan hasta un numero que ingresemos
static void bucle1() throws IOException {
	int contador = 3, multiplos = 0;
	System.out.println("Desea calcular los multiplos de 3 hasta el numero : ");
	int numero = Integer.parseInt(read());
while(contador <= numero){
	
	if(contador % 3 == 0){

		System.out.println(contador + " es multiplo de 3");
		multiplos++;
	}
contador++;	
}
	
System.out.println("De 1 a "+ numero + " existen " +multiplos + " multiplo(s) de 3");	
}
// imprime numeros del 1 al 100 y suma por un lado todos los pares y por otro los impares
static void bucle2(){
int sumaPar = 0,sumaImpar = 0;
for(int numero = 1; numero <= 100;numero++){
if(numero % 2 == 0){
	sumaPar += numero;
}
else {
	sumaImpar += numero;
}
System.out.println(numero);
}
System.out.println("Suma de numeros pares : " +sumaPar );
System.out.println("Suma de numeros impares : " +sumaImpar );

}

// imprimir y contar los numeros que son multiplos de 2 y 3 que hay entre 1 y 100

static void bucle3(){
	
	int conta2 = 0, conta3 = 0;
	for(int numero = 2; numero <= 100; numero++){
		
	if(numero % 2 == 0)
		conta2++;
	else if(numero % 3 == 0)
		conta3++;	
	}
System.out.println("Los multiplos de 2 entre 1 a 100 son : " + conta2);	
System.out.println("Los multiplos de 3 entre 1 a 100 son : " + conta3);	
}
// imprima el mayor y el menor de una serie de cinco numeros que vamos introduciendo por teclado.
static void bucle4() throws IOException {
int numero, maximo = 0, minimo = 99999;

for(int contador = 0; contador < 5; contador++){
System.out.println("Ingrese un numero : ");	
	numero = Integer.parseInt(read());	
	if(numero > maximo){
		maximo = numero;
	}
	if(numero < minimo){
		minimo = numero;
	}
}
System.out.println("De los 5 numeros ingresados el mayor de los numeros es : " +maximo);
System.out.println("De los 5 numeros ingresados el menor de los numeros es : " +minimo);

	
}
// Introducir dos numeros por teclado. Imprimir los numeros naturales que hay entre ambos numeros empezando por el mas pequeño, contar cuantos hay y
// cuantos de ellos son pares. Calcular la suma de los impares.
static void bucle5() throws IOException {
int limite1; int limite2, diferencia, pares = 0, suma = 0, temp1, temp2;
System.out.println("ingrese un numero : ");
limite1 = Integer.parseInt(read());
System.out.println("ingrese otro numero : ");
limite2 = Integer.parseInt(read());
diferencia = limite2 -limite1;
temp1 = limite1;
temp2 = limite2;
while(temp1 <= temp2){
	if(temp1 % 2 == 0){
		pares++;
	}
	else{
	suma += temp1;	
	}
	System.out.print(temp1 + " , ");
	
	temp1++;
}

System.out.println("La cantidad de numeros entre " +limite1 + " y " + limite2 + " son : " +diferencia );
System.out.println("Entre " +limite1 + " y " + limite2 + " hay " + pares + " numeros pares");
System.out.println("La suma de los numeros impares entre " +limite1 + " y " + limite2 + " es : " + suma);


}
public static void main(String[] args) throws IOException {
		// Creacion de objetos bucle1(); bucle2();	bucle3(); bucle4();	
bucle5();
}

}
