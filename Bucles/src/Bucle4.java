/** Uso de bucle While , Do while y For
 */
import java.util.*;
import java.io.*;

public class Bucle4 extends Print {

	// Metodo para determinar cuanto de los numeros en un arreglo es impar
		static void bucle1(){
StringBuffer sb = new StringBuffer();
Stack st = new Stack();
StringBuffer s1 = new StringBuffer("Buscando");			
	int[] valores = {6, 4, 10, 16, 4, 2, 4, 17, 100};

	
	for(int i = 0;i < valores.length;i++){
		
		if(valores[i] % 2 != 0){
	st.push(String.valueOf(valores[i]));
		}

		
	
	}
while (!st.empty()){
	System.out.println(s1.append("."));
	sb.append(new String ((String) st.pop() + "  ")); 	
}			

System.err.println("Son impares : " +sb);
		
		}
// Uso de break en un bucle
static void bucle2() throws IOException {
int ch;
	while(true){
		
		System.out.print("Ingrese una c o una C para continuar : ");
		ch = System.in.read();
		if(ch == 'c' || ch == 'C') break;
		
	}

System.out.print("Bienvenido !");
}

// Uso de While - sin break - el bucle termina cuando la condicion no se cumple
static void bucle3() throws IOException {
int ch;
	do {
	
		System.out.println("Ingrese una c o una C para continuar : ");
		
	}
		
		while((ch = System.in.read()) != 'c' && ch != 'C');
System.out.println("Bienvenido !!!");
	
}
// Uso de break para terminar la suma de datos de un array si esta supera un limite
static void bucle4(){
	int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int suma = 0;
	for(int i = 0; i < valores.length;i++){

		suma += valores[i];
if(suma > 12) break;
System.out.println("Recorriendo el bucle ...");
	}
System.out.println("La suma excede el valor maximo");	
}

// Uso de break para terminar un bucle anidado For, usando etiquetas para indicar el bucle del que se desea salir
static void bucle5(){
int [][] valores = {{1, 2, 3},
					{3, 2, 1},
					{2, 1, 3}};
int suma = 0;
outer : for(int outer_index = 0; outer_index < valores.length;outer_index++){
		for (int inner_index = 0;inner_index < valores[outer_index].length;inner_index++){
			
			suma += valores[outer_index][inner_index];
			if(suma > 3) break outer ;
		
		}
		System.out.println("No se imprime");
	}
System.out.println("El bucle ha terminado");
	
	
}
// Uso de continue - permite obviar un valor en el recorrido
static void bucle6(){
	for(double loop_index = 5; loop_index > -5;loop_index--){
		if(loop_index == 0) continue;
System.out.println("El inverso de " + loop_index + " = " + (1 / loop_index));		
		
		
	}
	
	
}

static void bucle7() throws IOException {
char ch;
System.out.print("Ingrese una opción : ");
ch = (char) System.in.read();
switch (ch){

case 'a' : System.out.println("Usted escogio la opcion A"); break;
case 'b' : System.out.println("Usted escogio la opcion B"); break;


}	

}

public static void main(String[] args) throws IOException {
		// Creacion de objetos bucle1(); bucle2(); bucle3();bucle4();bucle5();bucle6();
bucle7();
}

}
