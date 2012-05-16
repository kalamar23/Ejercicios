/** Tema 2 - uso de bucles anidados y subprogramas
 */
import java.io.*;


public class Bucle7 extends Print {

	// BufferedReader
		static String read() throws IOException {
		String s1;	
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();	
			return s1;
		}
// Uso de break para terminar un bucle anidado For , usando etiquetas
static void bucle1(){
	int [][] valores = {{1, 9, 9},{2, 1, 3},{3, 2, 1}, {4, 5, 2}};
	int suma = 0;
outer:	for(int outer_index = 0; outer_index < valores.length;outer_index++){
		
		for(int inner_index = 0; inner_index < valores[outer_index].length;inner_index++){
			
			suma += valores[outer_index][inner_index];
			if(suma > 12) break outer;
		}
	System.out.println("No se imprimira !");
	}
	
	System.out.println("El bucle ha terminado");
}
// Imprimir diez veces la serie de numeros del 1 al 10 ( bucle anidado For)
static void bucle2(){
	
	for(int i = 1; i < 10; i++){
System.out.println("Ciclo N° " +i);	
		
		for(int j = 1; j < 10; j++){
			System.out.println(j);
		}
	}
	
	
}
// imprimir, contar y sumar los multiplos de 2 que hay entre una serie de numeros, tal que el 
// segundo sea mayor o igual que el primero.
static void bucle3() throws IOException {
int numero1, numero2, conta = 0, suma = 0,temp1, temp2;
System.out.println("Ingrese un numero : ");
numero1 = Integer.parseInt(read());
do {
System.out.println("Ingrese un numero mayor al anterior : ");
numero2 = Integer.parseInt(read());
}
while(numero1 >= numero2);

temp1 = numero1; temp2 = numero2;

while(temp1 <= temp2){
		if(temp1 % 2 == 0){
			System.out.print(temp1 + " ,");
			suma += temp1;
			conta++;		
			}
		
temp1++;		
	}
System.out.println("Entre " +numero1 + " y " + numero2 + " existen " +conta + " numeros pares");
System.out.println("La suma de numeros pares entre " +numero1 + " y " + numero2 + " es " +suma);

}

// Hacer un codigo que cuente las veces que aparece una determinada letra en una frase que introduciremos por teclado.
	
static void bucle4() throws IOException {
	String s1;
	char letra;
	int conta = 0;
	System.out.println("Ingrese una frase : ");
	s1 = read();
	System.out.println("Ingrese la letra a buscar : ");
	letra = (char) System.in.read();
	
	for(int i = 0;i < s1.length();i++){
		if(letra == s1.charAt(i)){
			conta++;
		}
	}
System.out.println("La frase '" +s1 +"' tiene " + conta + " letras " + letra);	
}

// Hacer un codigo que simule el funcionamiento de un reloj digital y que permita ponerlo en hora.
static void bucle5() throws IOException {
	int hora = 0, min = 0, sec = 0;



System.out.println("Ingrese hora : ");
hora = Integer.parseInt(read()); 

System.out.println("Ingrese minutos : ");
min = Integer.parseInt(read()); 

System.out.println("Ingrese segundos : ");
sec = Integer.parseInt(read());
while(hora < 24){
	while(min < 60){
		while (sec < 60){	
			System.out.println("Hora actual " +hora + " :: " +min + " :: " + sec + " Hrs");
	sec++;

		}
		min++;
		sec = 0;
	}
	hora++;
	min = 0;
}

}
// imprimir 10 veces de 1 a 10 bucle anidado
static void bucle6(){
	int i = 1, j = 1;
	
	while(i <= 10){
		System.out.println("Ciclo N° " +i);
		while(j <= 10){
			System.out.println(j);
j++;

		}
	i++;
	j = 1;
	}
	
}
	public static void main(String[] args) throws IOException {
		// Creacion de objetos bucle1();bucle2();bucle3(); bucle4(); bucle5();
	
	bucle6();
	}

}
