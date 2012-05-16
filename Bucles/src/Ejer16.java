import javax.swing.*;
import java.util.*;
public class Ejer16 {

//  Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
	static void numero() {
		int numero, temp;

		StringBuffer sb = new StringBuffer();
		try {
			String s1 = JOptionPane.showInputDialog("Ingrese un numero : ");
			numero = Integer.parseInt(s1);
			temp = numero;
			while (temp > 0) {

				sb.append(String.valueOf(temp % 10));
				temp /= 10;
			}

			JOptionPane.showMessageDialog(null, "El numero " + numero
					+ " invertido es = " + sb);

		}

		catch (NumberFormatException eo) {
			JOptionPane.showMessageDialog(null,
					" Usted no ha ingresado un numero");
			numero();
		}
	}
//  Pedir dos números y mostrarlos ordenados de mayor a menor
	static void numero2() {
		int numero1, numero2, mayor, menor;
		try {

			do {
				String s1 = JOptionPane.showInputDialog("Ingrese un numero :");
				numero1 = Integer.parseInt(s1);
				String s2 = JOptionPane
						.showInputDialog("Ingrese otro numero :");
				numero2 = Integer.parseInt(s2);
			} while (numero1 == numero2);
			if (numero1 > numero2) {
				mayor = numero1;
				menor = numero2;
			} else {
				mayor = numero2;
				menor = numero1;
			}

			JOptionPane.showMessageDialog(null, "De mayor a menor : " + mayor
					+ " , " + menor);

		} catch (NumberFormatException eo) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un numero !");
			numero2();
		}

	}
	
//  Pedir tres números y mostrarlos ordenados de mayor a menor
	static void numero3(){
int numero1,numero2,numero3;
int mayor = 0, medio = 0, menor = 0; 
do {
String s1 = JOptionPane.showInputDialog("Ingrese un numero :");
numero1 = Integer.parseInt(s1);
String s2 = JOptionPane.showInputDialog("Ingrese un numero :");
numero2 = Integer.parseInt(s2);
String s3 = JOptionPane.showInputDialog("Ingrese un numero :");
numero3 = Integer.parseInt(s3);
}while(numero1 == numero2 || numero1 == numero3 || numero2 == numero3);

if(numero1 > numero2 && numero1 > numero3){
	mayor = numero1;
	if(numero2 > numero3){
		medio = numero2;
		menor = numero3;
	}
	else{
		medio = numero3;
		menor = numero2;
	}
}
if(numero2 > numero1 && numero2 > numero3){
	mayor = numero2;
	if(numero1 > numero3){
		medio = numero1;
		menor = numero3;
	}
	else{
		medio = numero3;
		menor = numero1;
	}
}

if(numero3 > numero1 && numero3 > numero2){
	mayor = numero3;
	if(numero2 > numero1){
		medio = numero2;
		menor = numero1;
	}
	else{
		medio = numero1;
		menor = numero2;
	}
}

JOptionPane.showMessageDialog(null, "De mayor a menor : " + mayor + " , " + medio + " , " + menor);
	}
// Obtener el numero mayor y menor de un array de enteros aleatorios de dos digitos
	
	
	
	
	public static void main(String[] args) {
		// TODO Creacion de objetos numero(); numero2();numero3();	
	}

}
