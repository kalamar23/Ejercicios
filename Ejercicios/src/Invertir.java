import javax.swing.*;
public class Invertir {

	
	// Leer 5 números y mostrarlos en orden inverso al introducido
public void numeros(){
	int[] valores = new int [5];
	StringBuffer sb = new StringBuffer();
	try{
	for(byte i = 0; i < 5; i++){
		
		valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));	
	}
	for(byte i = 4; i >= 0; i--){
	
		sb.append(String.valueOf(valores[i]) + " , ");	
	}
	
	JOptionPane.showMessageDialog(null, "Ordenados al reves : " + sb.delete(sb.length() - 2, sb.length()));
	}catch(NumberFormatException e){
		JOptionPane.showMessageDialog(null, "Debe ingresar un nunero : ");
		numeros();
	}
	
	
}
	
public int fac(int numero){
	if(numero == 0) return 1;
	
	return numero * fac(numero -1);
}

public int fab(int numero){
	if(numero < 2) return numero;	
	return fab(numero -1) + fab(numero -2);
	
}

public void fibo(){
	int numero;
	String s1 = JOptionPane.showInputDialog("Ingrese hasta que numero desea ver sucesion de fibonacci : ");
numero = Integer.valueOf(s1);
int valor1 = 1 , valor2 = 0;
StringBuffer sb = new StringBuffer();
// 1, 1, 2 ,3 ,5 ,8 ;
while(valor1 <= numero){
valor1 += valor2;
sb.append(String.valueOf(valor1) + " , ");	
valor2 += valor1;
sb.append(String.valueOf(valor2) + " , ");	
}


JOptionPane.showMessageDialog(null, "Fibonacci : " + sb);
}
// sucesion de cubicos 

public void cubico (){
int limite, numero = 1;
String s1 = JOptionPane.showInputDialog("Ingresa hasta que numero te gustaría ver la sucesion de cubicos : ");
limite = Integer.valueOf(s1);
StringBuffer sb = new StringBuffer();
while(numero <= limite){
int multi = numero * numero * numero++;		
if(multi <= limite){
sb.append(String.valueOf(multi) + " , ");
}
	}
	JOptionPane.showMessageDialog(null, "Sucecion cubica : " + sb.delete(sb.length() - 2, sb.length()));

}

// Solicitar 10 numeros , desplazar N posiciones (N es introducido por el  usuario)
public void desplazar(){

	int[] valores = new int [10];
StringBuffer sb = new StringBuffer();
String s1 = JOptionPane.showInputDialog("Posiciones a desplazar : ");	
int despla = Integer.valueOf(s1);	

for(byte i = 0; i < 10;i++){
		
valores[i] = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un numero :"));		
		
	}

for(byte i = 0; i < 10; i++){
	       
          
	
	
	
}
	
	

}




	public static void main(String[] args) {
		// Creacion de objetos
Invertir in = new Invertir();

	}

}
