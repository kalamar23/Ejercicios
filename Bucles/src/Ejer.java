import java.io.*;
import java.util.*;
public class Ejer extends Print {

// Reader - Metodo lector	
static String read() throws IOException {
	String s1;
BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	s1 = S.readLine();
return s1;
}

// introducir dos numeros por teclado y mediante un menu, calcule su suma, su
// resta, su multiplicacion o su division.
static void calcu() throws IOException {
	int numero1, numero2, op;
do {
System.out.println("Ingrese un numero : ");
	numero1 = Integer.parseInt(read());
System.out.println("Ingrese un segundo numero : ");
numero2 = Integer.parseInt(read());
} while (numero1 < 0 || numero2 < 0);

System.out.println("Elija una opcion : ");
Print3("1) suma ");
Print3("2) resta ");
Print3("3) multiplicar ");
Print3("4) salir ");

Print3("Ingrese una opcion : ");
op = Integer.parseInt(read());
switch(op){
case 1 : suma(numero1, numero2);break;
case 2 : resta(numero1,numero2); break;
case 3 : multi(numero1,numero2); break;
case 4 : close();break;
}

}
static void close(){
	System.out.println("Fin del programa ");
}
static void suma(int numero1,int numero2){

	System.out.println("La suma de " + numero1 + " + " + numero2 + " es = " + (numero1 + numero2));

}

static void multi (int numero1, int numero2){
	System.out.println("El producto de " + numero1 + " * " + numero2 + " es = " + (numero1 * numero2));	
}
	
static void resta(int numero1, int numero2){
	System.out.println("La resta de  " + numero1 + " - " + numero2 + " es = " + (numero1 - numero2));	

}



public static void main(String[] args) throws IOException {
		// Creacion de objetos 
	calcu();	

}

}
