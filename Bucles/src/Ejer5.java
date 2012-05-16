import java.io.*;
import java.text.NumberFormat;
import java.math.*;
/** Ejercicios
 */
public class Ejer5 extends Print {

	// Reader
		static String read() throws IOException {
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		return S.readLine()	;
		}
	// bucle For, uso de diferentes expresiones
	
static void bucle1() throws IOException {

	for(int loop_index = 1, numero = Integer.parseInt(read());loop_index <= 10;System.out.println(numero * loop_index++ ));
	
	
}
	
// Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los elementos de la lista debiendo ir 
// cada uno en una fila distinta.
static void arreglo(){
	
	String [] nombres = {"Claudio" , "Lorena", "Carolina", "Jorge", "Daniela", "Luis", "Pedro", "Roberto",
			             "Maria"	, "Marcela", "Florencia", "Bernarda", "Mauricio", "Felipe", "Margarita", 
			             "Fabiola", "Rodolfo", "Mario", "Camila", "Rafael"};
	
	for(int i = 0; i < nombres.length;i++){
		
		System.out.println(nombres[i]);
		
	}
	
}
// Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, las almacene en un vector y 
// calcule e imprima su media.
static void notas () throws IOException {
	String [] asignaturas = {"Matematica", "Biologia", "Quimica", "Lenguaje", "Fisica", "Ingles", "Historia", "E. Fisica", "E. musical",
			     "Computacion"};
	double suma = 0;
	double notas [] = new double [10]; 
	for(int i = 0; i < asignaturas.length;i++){
		System.out.println("Ingrese una nota para " + asignaturas[i]  + " : ");	
		notas[i] = Double.parseDouble(read());
	suma += notas[i];
	}
NumberFormat nf = NumberFormat.getNumberInstance();
nf.setMaximumFractionDigits(2);

System.out.println("El promedio final es = " + nf.format((suma/asignaturas.length)));	
}
// Usando el segundo ejemplo, hacer un programa que busque una nota en el vector.
static void buscar() throws IOException {

try {	
	double notas [] = {4.5 , 6.2, 3.9, 5.6, 4.9, 5.6, 5.6, 5.8, 4.5, 6.5}, notaID;

	System.out.println("Ingrese una nota  a buscar : ");
notaID = Double.parseDouble(read());


boolean found = false;
for(int i = 0; i < notas.length;i++){
	if(notas[i] == notaID){
		found = true;
		break;
	}
}
	
System.out.println((found) ? "El alumno tiene " + notaID + " entre sus calificaciones" : "No tiene " + notaID + " entre sus calificaciones");	
}
catch (NumberFormatException ioe){
	System.err.println("Usted solo puede ingresar numeros");
buscar();
}
}
// Generar una matriz de 4 filas y 5 columnas con numeros aleatorios entre 1 y 100, e imprimirla.
static void matriz(){
	int [][] valores = new int [4][5];
	int intervalo = 101;
	for(int outer_index = 0;outer_index < valores.length;outer_index++){
		for(int inner_index = 0; inner_index < valores[outer_index].length;inner_index++){
			valores[outer_index][inner_index] = (int) (Math.random() * intervalo); 		
		
			System.out.println("valores [" + outer_index+ "][" + inner_index +"]" + " = " + valores[outer_index][inner_index] );
		
		}
	}
	
}


public static void main(String[] args) throws IOException {
		// TODO Creacion de objetos bucle1(); arreglo(); notas(); buscar();
	matriz();
}

}
