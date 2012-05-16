/** Uso de bucles - While, Do While y For , Bucle
 */
import java.util.*;
public class Bucle3 extends Print {

	static void bucle1(){
		int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int suma = 0;
		for(int i = 0; i < valores.length;i++){

			suma += valores[i];
if(suma > 12) break;
System.out.println("Recorriendo el arreglo ...");

		}
System.err.println("La suma excede el valor maximo !");		
	}
	
	static void bucle2(){
	int target = 50, valor1 = 5;

	while(++valor1 * 5 != target);
		System.out.println("El valor de valor1 es = " + valor1);
		
	}
// 	Terminar un bucle anidado de dos dimensiones con uso de etiquetas
	static void bucle3(){
int[][] valores = {{1, 2, 3},
		           {3, 1, 2},
		           {1, 3, 2}};
int suma = 0;
outer : for(int outer_index = 0; outer_index < valores.length; outer_index++){
	
	for(int inner_index = 0;inner_index < valores[outer_index].length;inner_index++) {
		
suma += valores[outer_index][inner_index];
		if(suma > 3) break outer;		
}
System.out.println("no voy a imprimir");		

}
System.out.println("El bucle ha terminado");	
}
// convertir decimal en binario
	static void bucle4(int numero){
int temp = numero;		
StringBuffer sb = new StringBuffer();
Stack st = new Stack();
while(temp > 0){

	st.push(String.valueOf(temp % 2));
	temp >>= 1;
}

while (!st.empty()){
	
	sb.append(new String ((String) st.pop()));	
}
		
System.out.println("El numero " + numero + " convertido a binario es = " +sb);		
	}
// Metodo para determinar cual de los numeros en un arreglo es impar
	static void bucle5(){

int[] valores = {6, 4, 10, 14, 28, 2, 4, 17, 100};
boolean impar = false;
int ID = 0;
for(int i = 0;i < valores.length && (impar == false);i++){
	
	if(valores[i] % 2 != 0){
		impar = true;
ID = valores[i];
	}

	System.out.println("Buscando ...");
}

System.out.println((impar) ? "Se ha encontrado el numero " + ID + " que es impar" : "No hay ningun numero impar");	
		
	}
	
	public static void main(String[] args) {
		// Creacion de objetos bucle1(); bucle2();	bucle3(); bucle4(12);	

		bucle5();
	
	}

}
