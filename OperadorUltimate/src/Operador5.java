/**
 */
import java.io.*;
import java.math.*;
public class Operador5 {

public static boolean esPrimo(int numero){
 int contador = 2;
 boolean primo = true;
while((primo) && contador != numero ){
if (numero % contador == 0)
	primo = false;
contador++;	
}
return primo;
	
}
// uso de sentencia switch
static void ope1 () throws IOException {
	BufferedReader B = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Ingrese una opción a) b) c) : ");
	char opcion = (char) System.in.read();
	switch (opcion){
	case 'a' : System.out.println("Usted escogio la opcion A");break;
	case 'b' : System.out.println("Usted escogio la opcion B");break;
	case 'c' : System.out.println("Usted escogio la opcion C");break;

	}
}
// factorial
static void ope2(){
	// seis factorial (6!) = 6x5x4x3x2x1
	int valor1 = 6, factorial = 1, temp;
temp = valor1;
	while (temp > 0){
	
	factorial *= temp--;
}
	
	System.out.println(valor1 +"! = "+ factorial);
	
	
}

static int ope3(int valor1){
	int factorial = 1, temp;
temp = valor1;
	while (temp > 0){
	
	factorial *= temp--;
}
System.out.println(valor1 + "! = "+factorial);	
return factorial;	
	
}

static void ope4() throws IOException {
	int ch;
	System.out.println("Ingrese un texto cualquiera");
while((ch = System.in.read()) != 13 ){
	
	System.out.print((char) ch);
	
}
	
	
	
}

static void ope5() throws IOException {
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader B = new BufferedReader(reader);
System.out.println("Ingrese un texto y el fantasma respondera : ");
	for (String line;(line = B.readLine()) != null;System.out.println(line)){
		
		if(line.contains("llama")){
			System.out.println("Mi nombre es SIRI");
		}
	}


}
public static void main(String[] args) throws IOException {
		// Creacion de objetos

//System.out.println(esPrimo(5)); ope1();ope3(8); ope4();
ope5();
}

}
