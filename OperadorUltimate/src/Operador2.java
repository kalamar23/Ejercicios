/** Operadores de la clase String y uso de clase MATH
 */

import java.math.*;

public class Operador2 {

public void ope1(){
	
	double valor1 = 5;
	double valor2 = 20.5, valor3 = 10.2;
	System.out.println("3x3x3x3 = "+ Math.pow(3, 4));
	// Nivel de presion sonora - 120 dB
	System.out.println(20 * Math.log10(1000000) + " dB");
	System.out.println("la raiz cuadrada de 25 es = " +Math.sqrt(25));
	System.out.println(" valor PI circunferecia de un circulo" +Math.PI);
	System.out.println("Redondeo de un double" +Math.round(valor1));
	System.out.println("El signo del numero es = " +Math.signum(valor1));
	System.out.println("Muestra el numero menor entre dos valores = " +Math.min(valor2,valor3));
	
}
//metodos de la clase String que puede usarse como operadores : Equals, EqualsIgnoreCase y CompareTo	
public void ope2(){
	String s1 = "abc";
	String s2 = "abc";
	String s3 = "ABC";
	String s4 = "cab";
	
	if(s1.equals(s2)){	
		System.out.println("s1 == s2");	
	}
	else {
		System.out.println("s1 != s2");	

	}
	
	if(s1.equalsIgnoreCase(s3)){
		System.out.println("s1 == s3 al ignorar las mayusculas");
	}
	else {
		System.out.println("s1 != s3 al ignorar las mayusculas");	
	}
	if(s1.compareTo(s4) < 0){
		
		System.out.println("s1 < s4");	
	}
	else if (s1.compareTo(s4) == 0){
		System.out.println("s1 == s4");			
	}
	else if (s1.compareTo(s4) > 0){
		
		System.out.println("s1 > s4");				
	}
}

	public static void main(String[] args) {
		// Creacion de objetos
		
		Operador2 op = new Operador2();
		// op.ope1();
op.ope2();
	}

}
