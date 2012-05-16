/** 
 */
import javax.swing.*;

import java.math.*;
import java.util.*;
import java.awt.BorderLayout;;
public class Ejer11 {

	// Generar un array de enteros aleatorios entre un intervalo de numeros
	static void Random(){
	int numero, limite = 90, prueba;
		String s1 = JOptionPane.showInputDialog(null, "Ingrese un numero");
	numero = Integer.parseInt(s1);
	int valores [] = new int [numero];
	StringBuffer sb = new StringBuffer();
for(int i = 0; i < valores.length;i++){
	valores[i] = 65 + (int) (Math.random() * ((limite - 65) + 1));
	sb.append(String.valueOf(valores[i] + " ,"));

}
JOptionPane.showMessageDialog(null, "{ " + sb + " }");
		
	}

	// ingresar 5 numeros por teclado y diga cual es menor y cual es mayor
static void numeros(){
	int minimo = 99999;
	int maximo = 0, numero;
	String s1;
for(int i = 0; i < 5; i++){
s1 = JOptionPane.showInputDialog("Ingrese un numero : ");
numero = Integer.parseInt(s1);
	if(numero > maximo){
		maximo = numero;
	}
	if(numero < minimo){
		minimo = numero;
	}
	
}
	JOptionPane.showMessageDialog(null, "De los numeros ingresados el mayor es = " + maximo + " y el menor es = " + minimo);
}
	
	// Implemente una Clase donde al ingresar un número, indique: a) la cantidad de cifras que tiene el número
//    b) la suma de las cifras del número c) el número invertido
static void numeros2(){
	int numero, suma = 0;
	Stack st = new Stack();
	StringBuffer sb = new StringBuffer();
String s1 = JOptionPane.showInputDialog("Ingrese un numero :");
numero = Integer.parseInt(s1);
int temp = numero;
JOptionPane.showMessageDialog(null, "El numero tiene " + s1.length() + " cifra(s)");
while(temp != 0){	
st.push(String.valueOf(temp % 10));
	suma += temp % 10;
	temp /= 10;
}
while(!st.empty()){
	sb.append(new String ((String) st.remove(0)));
}
JOptionPane.showMessageDialog(null, "La suma de las cifras de " + numero + " es = " + suma); 
JOptionPane.showMessageDialog(null, "El numero invertido " + numero + " es = " + sb);
}
// Implemente una Clase que permita: a)  Generar en forma aleatoria 50 Números de 2 cifras (array)
// b) Calcular y visualizar Promedio de los números c)  Visualizar todos números que sean mayores a promedio	
static void arreglo(){
	int numero = 99;
	int [] valores = new int [50]; 
	double suma = 0, prome;
	StringBuffer sb = new StringBuffer();
	StringBuffer mayor = new StringBuffer();
	
	for(int i = 0; i < valores.length;i++){
	
		valores[i] = 20 + (int) (Math.random() * ((numero - 20) + 1));
	suma += valores [i];
	sb.append(String.valueOf(valores[i] + " , "));

	}
	
	prome = suma/valores.length;
	for(int i = 0; i < valores.length;i++){
		if(valores[i] > prome){
		mayor.append(String.valueOf(valores[i] + " , "));
		}
		}

JOptionPane.showMessageDialog(null,  "Valores { " + sb + " }");	
JOptionPane.showMessageDialog(null, "El promedio del array es :" + prome);
JOptionPane.showMessageDialog(null, "Mayores a promedio : " + mayor);
}

// Mostrar sucesion de Fibonacci hasta cierto numero
static void sucecion(){
int numero, suce1 = 1,suce2 = 0;
	String s1 =	JOptionPane.showInputDialog(null, "Ingrese un numero hasta que desea ver la sucesion :");
	numero = Integer.parseInt(s1);
StringBuffer sb = new StringBuffer();
while(suce1 < numero){

	suce1 += suce2;
if(suce1 < numero){
	sb.append(String.valueOf(suce1 + " , "));
}
suce2 += suce1;
if(suce2 < numero){
	sb.append(String.valueOf(suce2 + " , "));
}
}
JOptionPane.showMessageDialog(null, "Fibonacci = " + sb );	
}

	public static void main(String[] args) {
		// Creacion de objetos Random(); numeros(); numeros2();arreglo();
	sucecion();
	
	}

}
