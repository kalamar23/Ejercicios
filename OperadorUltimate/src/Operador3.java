/** Operadores - uso de sentencia if else  
 */
import java.math.*;
public class Operador3 {

	// Metodos 
	
	// el numero es positivo y devuelve su valor absoluto
	public void ope1(){
		int valor1 = 10;
				if(valor1 > 0){
					System.out.println("El numero era positivo");
					System.out.println("Abs(" + valor1 + ") = " + valor1);		
				}
	}
	// numero negativo devuelve su valor absoluto
	public void ope2(){
		int valor1 = -10;
// 11111111111111111111111111110110 = -10 en representacion binaria complemento a dos		

		if(valor1 > 0) {
			System.out.println("El numero era positivo");
			System.out.println("Abs(" + valor1 + ") = " + valor1);	
			}
		else {
			System.out.println("El numero era negativo");
			System.out.println("Abs(" + valor1 + ") = " + -valor1);	
		}
		
	}
// uso de if anidados
	public void ope3(){
		
		double valor1 = -2;
		if(valor1 != 0){
			if(valor1 > 0){
		System.out.println("El resultado es = " + (1/valor1));
			}
			else{
				System.out.println("El resultado es = " +( -1 /valor1));
			}
		}
	}

// uso de if -else 	
	public void ope4(){
String dia = "Jueves";
if(dia == "Lunes"){
	System.out.println("Hoy es Lunes !");
}
else if (dia == "Martes"){
	System.out.println("Hoy es Martes");
}

else if (dia == "Miercoles"){
	System.out.println("Hoy es Miercoles");
}
		
else if (dia == "Jueves"){
	System.out.println("Hoy es Jueves");
}

else if (dia == "Viernes"){
	System.out.println("Hoy es Viernes");
}
	}

// uso de metodo abs de la clase MATH
	public void ope5(){
		// el numero es negativo, mostrare el valor absoluto por pantalla
		int valor1 = -25;
		
		System.out.println(Math.abs(valor1));
		
		
		
		
	}
// Uso de sentencia switch	basandose en un valor numerico
	public void ope6(){
		int valor1 = 3;
		
		switch (valor1){
		
		case 1 : System.out.println("Hoy es lunes !"); break;
		case 2 : System.out.println("Hoy es Martes !"); break;
		case 3 : System.out.println("Hoy es Miercoles !"); break;
		case 4 : System.out.println("Hoy es Jueves !"); break;
		case 5 : System.out.println("Hoy es Viernes !"); break;
		case 6 : System.out.println("Hoy es Sabado !"); break;
		case 7 : System.out.println("Hoy es Domingo !"); break;
		}
		
	}
	
	public static void main(String[] args) {
		// Creacion de objetos
Operador3 op = new Operador3();
	//op.ope1(); op.ope2();op.ope3();op.ope4();op.ope5();
	op.ope6();
	
	
	}


}
