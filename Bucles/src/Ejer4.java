/** Ejercicios
 */
import java.io.*;
import java.util.*;
public class Ejer4 extends Print {

// Reader
	static String read() throws IOException {
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	return S.readLine()	;
	}
// Uso de break en bucle anidado, usando etiqueta para indicar el bucle que se desee interrumpir 	
static void bucle1(){
	int valores [][] = {{2, 1, 8, 5},{3, 12, 5, 7}};
	int suma = 0;
outer :	for(int outer_index = 0;outer_index < valores.length;outer_index++){
		
		for(int inner_index = 0;inner_index < valores[outer_index].length;inner_index++){
			
suma += valores[outer_index][inner_index];		
if(suma > 12) break outer;
		}
		Print3("No se imprimira");
	}
	Print3("El bucle ha terminado");
}
// Uso de Continue 
static void conti(){
	for(double loop_index = 5; loop_index > -5;loop_index--){
		if(loop_index == 0) continue ;
System.out.println("El inverso de " + loop_index + " = " + (1 / loop_index));		
	}
}
// Uso de bucle For sin cuerpo
static void suma(){
	int [] valores = {1, 3, 13, 11, 56};
	int suma = 0;
	for(int i = 0; i < valores.length; suma += valores[i++]);
	
	System.out.println("La suma de valores del array es = " + suma);

}

// Crear un conversor a hexadecimal
static void hexa() throws IOException {
int numero, op, temp;

	System.out.println("Ingrese un numero : ");
	numero = Integer.parseInt(read());
	temp = numero;
StringBuffer sb = new StringBuffer();
Stack st = new Stack();
	while(temp > 0){
op = (temp % 16);
if(op < 16 && op > 9){
switch(op){
case 15 : st.push(String.valueOf("F"));break;
case 14 : st.push(String.valueOf("E"));break;
case 13 : st.push(String.valueOf("D"));break;
case 12 : st.push(String.valueOf("C"));break;
case 11 : st.push(String.valueOf("B"));break;
case 10 : st.push(String.valueOf("A"));break;
}
temp >>>= 4;
}	
else {
st.push(String.valueOf(temp % 16));
	temp >>>= 4;
}

	}
	
while(!st.empty()){
	
sb.append(new String((String) st.pop()));
}

System.out.println("El numero " + numero + " convertido a hexadecimal es : " + sb);
	
}
	
	public static void main(String[] args) throws IOException {
		// Creacion de objeto TODO bucle1(); conti(); suma();		
	hexa();
	
	}

}
