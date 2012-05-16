import javax.swing.*;
import java.math.*;
import java.util.*;
import java.io.*;
public class Ejer8 extends Print {

// reader
	static String read() throws IOException {
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	
	return S.readLine();
	}
// conventir de decimal a romano
static void romano (){
String numero1;
StringBuffer sb = new StringBuffer();
int numero;
numero1 =  JOptionPane.showInputDialog("Ingrese un numero : ");
numero = Integer.parseInt(numero1);
int temp = numero;
while(numero >= 1000){	
		sb.append("M");	
	numero -= 1000;
	}
	while(numero >= 900){
		sb.append("CM");
numero -= 900 ;
	
	}
	while(numero >= 500){
		sb.append("D");
	numero -= 500;
	}
	while(numero >= 400){
		sb.append("CD");
	numero -= 400;
	}
	
	while(numero >= 100){
		sb.append("C");
		numero -= 100;
	}
	while(numero >= 90){
		sb.append("XC");
		numero -= 90;
	}
	
	while(numero >= 50){
		
		sb.append("L");
		numero -= 50;
	}
	
	while(numero >= 40){
		sb.append("XL");
		numero -= 40;
	}
	while(numero >= 10){
		sb.append("X");
		numero -= 10;
	}
	while(numero >= 9){
		sb.append("IX");
		numero -= 9;
	}
	while(numero >= 5){
		sb.append("V");
		numero -= 5;
	}
	while(numero >= 4){
		sb.append("IV");
		numero -= 4;
	}
	
	while(numero >= 1){
		sb.append("I");
		numero -= 1;
	}

JOptionPane.showMessageDialog(null, temp + "  en romano es = " + sb);

}

// Crear el código de un programa que genera tres números enteros aleatorios a, b, c, comprendidos entre 65 y 90, 
// ambos inclusive. Los mostraremos en pantalla.
	static void numeros(){
		int a, b, c;
		int valor = 90;

a =	65 + (int)(Math.random() * ((valor - 65) + 1));
b =	65 + (int)(Math.random() * ((valor - 65) + 1));
c =	65 + (int)(Math.random() * ((valor - 65) + 1));

JOptionPane.showMessageDialog(null, "a = " + a + ", b = " + b  + ", c = " +c);
	}

// Calcular factorial
	static void factorial(){
	int numero, temp, facto = 1;
String s1 =	JOptionPane.showInputDialog("Ingrese un numero : ");	
		numero = Integer.parseInt(s1);
		temp = numero;
		while(temp > 0){
			facto *= temp--;
		}
	JOptionPane.showMessageDialog(null, numero + "! = " +facto);
	}
// Simular un password
	static void password() throws IOException {
		int s1, s2, s4;
String s3;
try {
		System.out.println("Ingrese un password : ");
		s1 = Integer.parseInt(read());
		System.out.println(s1);
		System.out.println("Repita el password : ");
        s2 = Integer.parseInt(read());
	

        if(s1 != s2){
        	System.out.println("El password no coincide");
        	password();
        }
s3 = JOptionPane.showInputDialog("Ingrese la contraseña :");		
s4 = Integer.parseInt(s3);
if(s4 == s1){
			Print3("Bienvenido al sistema !");
		}
		else{
			Print3("Lo siento no está autorizado !");

		}
}
catch (NumberFormatException eo){
	Print3("Usted debe ingresar solo numeros");
password();
}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Creacion de objetos Ejer8.romano(); Ejer8.numeros();Ejer8.factorial();	
	Ejer8.password();
	}
 
}
