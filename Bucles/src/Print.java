public class Print {
int valor1,valor2, valor3;
String s1, s2, s3;
boolean bo1,bo2,bo3;
double do1,do2,do3;
Print (){
	
}

Print(boolean bo1, boolean bo2){
	
	this.bo1 = bo1;
	this.bo2 = bo2;
	
}


Print (int valor1, int valor2){
	this.valor1 = valor1;
	this.valor2 = valor2;
Print1(valor1,valor2);	
}
Print(int valor1){
	this.valor1 = valor1;
	Print2(valor1);
}

Print(double do1, double do2){
	this.do1 = do1;
	this.do2 = do2;
	Print4(do1 , do2);
}

Print(String s1){
	this.s1 = s1;
	
	Print3(s1);
}
/**Prompt para imprimir dos enteros
 */
static void Print1 (int valor1, int valor2){
		
		System.out.println("El valor de valor1 = " +valor1 );
		System.out.println("El valor de valor2 = " +valor2 );		
	}
/** Prompt para imprimir un numero entero
 */
static void Print2 (int valor1){
	
	System.out.println("El valor entero es = " +valor1);
}

/** Prompt para imprimir dos String s1 y s2
 */
static void Print3 (String s1){
	
	System.out.println(s1);
	

}

/** Prompt para imprimir dos valores double do1 y do2
 */
static void Print4 (double do1, double do2){
	
	System.out.println("El valor de double 1 = " +do1 );
	System.out.println("El valor de double 2 = " +do2 );		
}


/** Prompt para imprimir dos valores booleanos bo1 y bo2
 */
static void Print5 (double do1, double do2){
	
	System.out.println("El valor de double 1 = " +do1 );
	System.out.println("El valor de double 2 = " +do2 );		
}


}
