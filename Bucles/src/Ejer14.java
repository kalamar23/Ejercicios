/**
 */
import java.io.*;
import javax.swing.*;
public class Ejer14 {

	// reader
	static String read() throws IOException {
	
BufferedReader S = new BufferedReader(new InputStreamReader(System.in));		
		return S.readLine();	
	}

	// Devuelve el N simo valor de Fibonacci
	static int fibo(int numero){
		
		if(numero < 2) return numero ;	
		
		
		return fibo(numero - 1) + fibo (numero -2);			
		}
	
// Calcular factorial de un numero de forma recursiva
static int factorial(int numero){
	if(numero == 0) return 1 ; // Evita null 
	
	return numero * factorial(numero - 1);
}

// Se desea implementar una Clase que permita visualizar todos los n_esimos números primos, donde n se ingresa
static void primos(){
int numero,conta = 2;

boolean primo = true;
StringBuffer sb = new StringBuffer();
String s1 = JOptionPane.showInputDialog("Ingrese hasta que numero primo desea ver :");
numero = Integer.parseInt(s1);
for(int nume2 = 4;nume2 <= numero;nume2++){
	while((primo) && conta < nume2){
		
		if(nume2 % conta == 0)
			primo = false;	
conta++;
	}
primo = true;
conta = 2;
}

}

//  Implemente una Clase donde al ingresar una Cadena, visualice: a) Cantidad de vocales b) Cantidad de dígitos
// c) Cantidad de consonantes
static void cadena(){
	int conta = 0, conta2 = 0;
String s1 =	JOptionPane.showInputDialog("Ingrese una frase o palabra : ");
	
// cantidad de vocales
for(int i = 0; i < s1.length();i++ ){
	
	switch(s1.toUpperCase().charAt(i)){
	case 'A' :
	case 'a' : 
	case 'E' :
	case 'e' : 
	case 'I' :
	case 'i' : 
	case 'O' :
	case 'o' : 
	case 'U' :
	case 'u' : conta++;break;
	case 'B' :  
	case 'C' :  
	case 'D' :  
	case 'F' : 
	case 'G' : 
	case 'H' : 
	case 'J' :
	case 'K' :
	case 'L' : 
	case 'M' : 
	case 'N' : 
	case 'P' : 
	case 'Q' : 
	case 'R' : 
	case 'S' : 
	case 'T' : 
	case 'V' : 
	case 'W' :
	case 'X' : 
	case 'Y' : 
	case 'Z' : conta2++;break;
	}

	// fin de conteo de vocales
	
}

JOptionPane.showMessageDialog(null, s1 +  " tiene " + conta + " vocales ");
JOptionPane.showMessageDialog(null, "La frase contiene " + s1.length() + " digitos");	
JOptionPane.showMessageDialog(null, "La frase contiene " + conta2 + " consonantes");	

}



public static void main(String[] args) throws IOException {
		// TODO Creacion de objetos primos();		
cadena();	

}

}
