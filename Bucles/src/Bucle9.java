import java.io.*;
import java.math.*;

public class Bucle9 extends Print {

	// BufferedReader
		static String read() throws IOException {
		String s1;	
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();	
			return s1;
		}
// Introducir un numero menor de 5000 y pasarlo a numero romano.
static void romano() throws IOException {
	int numero;
	do{
	System.out.print("Ingrese un numero : ");
		numero = Integer.parseInt(read());
	} while (numero < 1 || numero > 5000);
	while (numero >= 1000){
		System.out.print("M");
	numero -= 1000;
	}
	while (numero >= 900){
		System.out.print("CM");
	numero -= 900;
	}
	
	while(numero >= 500){
		System.out.print("D");
numero -= 500;
	}
	while(numero >= 400){
		System.out.print("CD");
		numero -= 400;	
	}
	while (numero >= 100){
		System.out.print("C");
	numero -= 100;
	}
	while (numero >= 90){
		System.out.print("XC");
numero -= 90;
	}
	while (numero >= 50){
		System.out.print("L");
	numero -= 50;
	
	}
	while (numero >= 40){
		System.out.print("XL");
numero -= 40;
	}
	while (numero >= 10){
		System.out.print("X");
numero -= 10;
	}
	while(numero >= 9){
		System.out.print("IX");
numero -= 9;
	}
	while (numero >= 5){
		System.out.print("V");
numero -= 5;
	}
	while (numero >= 4){
		System.out.print("IV");
numero -= 4;
	}
	while (numero >= 1){
		System.out.print("I");
numero -= 1;
		
	}
}
static void romano2() throws IOException {
	int numero;
do{
	System.out.println("Ingrese un numero : ");
	numero = Integer.parseInt(read());
} while(numero < 1 || numero > 5000);
while(numero > 0) {

if(numero >= 10){
	System.out.print("X");
	numero -= 10;
}
if (numero >= 9){
	System.out.print("IX");
	numero -= 9;
}
if(numero >= 5){
	System.out.print("V");
numero -= 5;
}

if(numero >= 4){
	System.out.print("IV");
	numero -= 4;
}

if(numero > 0){
	System.out.print("I");
	numero -= 1;
}
}
}
	
// Realizar la tabla de multiplicar de un numero entre 0 y 10.
static void tabla() throws IOException {
int tabla;	
	Print3("Ingrese la tabla que desea calcular : ");
	tabla = Integer.parseInt(read());
	
for(int multi = 0,resul = 0;multi <= 10;multi++,resul = tabla * multi){
	
	System.out.println(tabla + " * " + multi + " = " + resul );
}
}
// Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
static void moneda() throws IOException {
char op;
	Print3("Desea tirar la moneda (s/n) : ");
	op = (char) System.in.read();
double moneda;	
if (op == 's' || op == 'S'){
moneda = Math.random();		
System.out.println(moneda);
		if(moneda < 0.5){
			System.out.println("La moneda da cara !");
		}
		else {
			Print3("La moneda da Cruz !");
		}
	}
else {
	Print3("La moneda no ha sido lanzada");
}
	
}
// Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
static void dados() throws IOException {
int tiradas = 1,conta = 0, dado1 = 7, dado2 = 7,veces,total;
	System.out.println("Ingrese la cantidad de veces que desea tirar los dados : ");
	veces = Integer.parseInt(read());
System.out.println("ingrese la probabilidad que desea calcular (ejem. ambos sumen 10) :");
total = Integer.parseInt(read());
	while(tiradas++ <= veces){
		dado1 *= Math.random();
		if(dado1 == 0)
			dado1 = 1;
		dado2 *= Math.random();
		if(dado2 == 0)
			dado2 = 1;

if((dado1 + dado2) == total){
	conta++;
}
	
dado1 = 7;
dado2 = 7;
	}
	
System.out.println("Los dados fueron lanzados " + veces + " veces y en " + conta + " ocaciones la suma de ambos fue " +total);	
	
}

public static void main(String[] args) throws IOException {
		// Creacion de objetos romano();tabla();moneda();
dados();		

}

}
