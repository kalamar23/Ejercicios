/** Operadores y uso de sentencia Switch
 */

import java.math.*;


public class Operador4 {
// uso de switch anidado 
	static void ope1(){
		int temperatura = 68;
		
		switch (temperatura){
	
		case 60:
		case 61:
		case 62:
		case 63:
		case 64: System.out.println("Demasiado frio");break;
		case 65:
		case 66:
		case 67:
		case 68:
		case 69: System.out.println("frio");break;
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75: System.out.println("Templado");break;
		
		default: System.out.println("Probablemente demasiada calor");break;
		}
		
		
		
		
	}
//	uso de bucle while - calcular factorial
	static void ope2(){
		// Bucle while dura hasta cuando valor1 deje de ser positivo 
		int valor1 = 10;
		
		while (valor1 > 0){
			
			System.out.println("El valor actua es = " + valor1--);
		}
	// bucle while para obtener 6 factorial  (6!) 6x5x4x3x2x1	
		int valor2 = 6, factorial = 1, temp;
		temp = valor2;
		while(temp > 0){
			factorial *= temp--;
		
		}
		System.out.println(valor2 + "! = " + factorial);
	}

	static void ope3(){
// operador asignación de division /=
		int valor1 = 500000;
		int valor2 = 15, cuenta = 0;
		while (valor1 > 1000){
			cuenta++;
			valor1 /= (valor2--);
		System.out.println(valor1 + " / " + valor2 + " = " +valor1);
		}
		System.out.println(cuenta);
		System.out.println("El resultado es = " + valor1);
		
	}
// operador de decremento 
	static void ope4(){

int valor1 = 10 , valor2;
valor2 = --valor1;

System.out.println(valor2);
		
	}

	static void ope5(){
	
		
	}
	
	
	public static void main(String[] args) {
		// Creacion de objetos
		//ope1();ope2();
		//ope3();
	//ope4();
	ope5();
	}

}
