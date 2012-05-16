/**
 */
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;
public class Ejer12 {


// Sucecion de Fibonacci
	static void suce() {
int numero, a = 1, b = 0,c;
StringBuffer sb = new StringBuffer();
String s1 =	JOptionPane.showInputDialog("Ingrese el numero hasta el que desea ver la sucesion : ");
numero = Integer.parseInt(s1);
		while(a < numero){	
a += b;
sb.append(a + " , ");
b += a;
sb.append(b + " , ");

		}		
		
JOptionPane.showMessageDialog(null,"Fibonacci = " + sb);		

int numero2 = JOptionPane.showOptionDialog(null, "Seleccione", "Escoja", 
JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, 
			new Object [] {"Opcion 1" , "Opcion 2", "Opcion 3"}, "Opcion 3");
	}

// Uso de bucle For - sin cuerpo	
static void bucle1(){
double [] grados = {2.4, 3.4, 15.2, 21.5, 13.4};
double suma = 0;	
for(int i = 0; i < grados.length;suma += grados[i++]);
JOptionPane.showMessageDialog(null, "La suma del array es : " + suma);
	
}
// Crear un array de dos dimensiones con valores aleatorios de dos digitos y transponer valores en un segudo array	
static void transpo(){

	
	int numero = 98;
	int [][] valores1 = new int [5][4];
	int [][] valores2 = new int [4][5];

for(int i = 0;i < valores1.length;i++){
	
	for(int j = 0; j < valores1[i].length;j++){
		
		valores1[i][j] = (int) (Math.random() * numero);
System.out.println("valores1["+i+"][" + j + "] = " + valores1[i][j]);
	}
}

for(int i = 0;i < valores2.length;i++){
	
	for(int j = 0; j < valores2[i].length;j++){
		
		valores2[i][j] = valores1[j][i];
		System.out.println("valores2["+i+"][" + j + "] = " + valores2[i][j]);

	}
}


}
// crear una sucesion de cuadrados
static void cuadrado(){
	// 1, 4, 9, 16, 25, 36, 49, 64, 81,
try {
	String s1 = JOptionPane.showInputDialog("Ingrese un numero hasta la que desea ver la sucesion de cuadrados :");
int	limite = Integer.parseInt(s1);
StringBuffer sb = new StringBuffer();
	for(int numero = 1, sqrt = 1;numero < limite;sqrt = ++numero * numero){
		sb.append(sqrt + " , ");

	}


int largo = sb.length();	
JOptionPane.showMessageDialog(null,"Sucesion sqrt = " + sb.delete(largo -2,largo));
}
catch(NumberFormatException e){
JOptionPane.showMessageDialog(null, "No ha ingresado un numero !");
}
}
// calcular factorial de un numero - recursivo
static int factorial(int numero){
	
	if(numero == 1) return 1 ; // evita null
	
	return numero * factorial(numero - 1);
}

static int fibo(int numero){
	if(numero < 2) return numero;
	
	return fibo(numero - 1) + fibo(numero -2); 
}

public static void main(String[] args) throws IOException {
		// TODO Creacion de objetos suce(); bucle1(); transpo(); suce(); cuadrado();


}

}
