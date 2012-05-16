import java.text.NumberFormat;
import java.io.*;
import java.io.BufferedInputStream;;
/** Uso de bucles while y for
 */
public class Buckle {

// revisar datos desde un array de enteros que tengan el 4to bit activo (1)
	static void bucle1(int[] valores){
		
int [] temp = valores.clone();

for(int i = 0;i < temp.length;i++){
	temp [i] &= 1 << 3;
	if(temp [i] != 0){
		System.out.println(valores[i] + " tiene el 4to bit activo (1)");
		
	}
	
}


		
	}
// Gestionar array de enteros con un bucle while
	static void bucle2(){
int [] valores = {23, 5, 2, 29, 6, 7};
int i = 0,suma = 0;
while ( i < valores.length){
	
	suma += valores [i];
	i++;
}
System.out.println("La suma de los numeros del array es = " +suma);
	
		
	}
// Uso de bucle for
	static void bucle3(){

for(int index = 1;index <= 10;index++){
	
	System.out.println("El valor actual es = " +index);
}
	
	}
	// Calcula valor medio de grados - Array y uso de bucle for
static void bucle4(){
	double[] grados = { 30.2, 45.2, 37.4, 25.5, 29.8, 35.7};
	double suma = 0, promedio;
	for (int i = 0; i < grados.length;i++){
		
		suma += grados[i];		
	}
	promedio = suma/grados.length;
NumberFormat nf = NumberFormat.getNumberInstance();
nf.setMaximumFractionDigits(2);
String sb = nf.format(promedio);

	System.out.println("El valor promedio de temperaturas es = " +sb);
}
// Calcular valor promedio de grados - Array de dos dimensiones y uso de bucle	
static void bucle5(){
	double[][] grados = {{30.5, 20.5, 40.7, 34.5},
			             {21.5, 28.9, 37.6, 19.5}};
	double suma = 0;
	int total = 0;		
	for(int outer_index = 0;outer_index < grados.length;outer_index++){
		for(int inner_index = 0;inner_index < grados[outer_index].length;inner_index++){
			suma += grados[outer_index][inner_index];	
			total++;
		}
	
	}
	
	System.out.println("El valor promedio de temperaturas es = " + suma/total);
	
}
// Uso distinto de for , con expresiones separadas por una coma
static void bucle6(){
	for(int loop_index =0, doubled = 0; loop_index <= 10;loop_index++,doubled = 2 * loop_index){
		
	System.out.println("El doble del indice " +loop_index+" es = " +doubled);
		
	}
	
}

// Suma de numeros de un array con operador for sin cuerpo (sentencia)
static void bucle7(){
	int [] valores = {23, 5, 6 , 8, 19 };
	int suma = 0;
	for (int loop_index = 0;loop_index < valores.length;suma += valores[loop_index++]);
	System.out.println("El valor promedio del arreglo es = " +suma);
}
//Uso de for como si fuesen While - Calcular factorial
static void bucle8(int numero){
int factorial = 1, temp = numero;
for(;temp > 0;factorial *= temp--);

System.out.println(numero +"!"+ " = " +factorial);
}
// Verificar si un numero es par
static void bucle9(int numero){
	boolean par = true;
int temp = numero;	
if(temp % 2 != 0)
	par = false;
	
System.out.println((par) ? "Es par !" : "Es impar !");
}
// Verificar si un numero es primo pero con bucle For en vez de While
static void esPrimo(int numero){
	// numero primo es aquel que solo es divisible por si mismo y por la unidad
int temp = numero;
boolean primo = true;
for(int contador = 2;(primo) && temp != contador;contador++){
	if(temp % contador == 0){
		primo = false;
	}	
}
System.out.println((primo)? "El numero es primo" : "El numero no es primo");

}
// Uso de for para otros usos
static void bucle10() throws IOException {
BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
for(String line;(line = B.readLine()) != null;System.out.println(line));	

}

public static void main(String[] args) throws IOException {
		// Creacion de objetos bucle1(valo);	bucle2();	bucle3();bucle4();bucle5();	bucle6();bucle7();bucle8(6);bucle9(9);esPrimo(7);
bucle10();
}

}
