/** Operadores, uso de arrays y listas
 */
import java.text.NumberFormat;
import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
public class Operador6 {

	static int ope1(int numero){
		int producto = 5, resulta;
		
		for(int i = 1;i <= numero;i++){
			
			resulta = (producto *= i);
System.out.println( (producto / i) +" x "+ i + " = " + resulta );
		
		}
		

		return producto;
		
	}

static int ope2(){
	
int arre [] = { 2, 5, 6, 7, 19};
	
List<Integer> ls = new ArrayList<Integer>();
	
for (int i = 0; i < arre.length;i++){
	
	ls.add(arre[i]);	

}

Collections.shuffle(ls);
System.out.println("El valor de array es : " + ls.remove(0));
return ls.remove(0);
}

static void ope3() throws IOException {
char ch;
do {
System.out.println("Ingrece c o C para continuar : ");	
ch = (char) System.in.read();
ope2();
}
	while(ch != 'c' && ch != 'C');
	
}

static void ope4(){
	double valor1 = 32.6745676;

	NumberFormat nf = NumberFormat.getNumberInstance();
	nf.setMinimumFractionDigits(3);
	String s1 = nf.format(valor1);
	System.out.println(s1);
}

static void ope5(){
	
	String s1 = "Hola desde Java";
	
System.out.println("Los primeros cinco caracteres de cadena s1 son : " +s1.substring(0,5));
	
}

static void ope6(){
	
StringBuffer s1 = new StringBuffer("Hola desde Java");
	char arre [] = {' ','h', 'o', 'l','a'};
	System.out.println(s1.append(arre));
System.out.println("La frase " + "\"" +s1 + "\"" + " = " );
}

// conversion de tipos de datos
static void ope7(){
	int valor1;
	char le = 'A';
	int valor2 = 32;
	char le1;
	valor1 = le;
// uso de cast
	le1 = (char) valor2;
}



public static void main(String[] args) throws IOException {
		// Creacion de objetos 
//ope1(10);System.out.println(ope2());ope3();ope4();ope5();ope6();
ope7();
}

}
