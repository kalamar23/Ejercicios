import javax.swing.*;
public class Arrays  {

/*	 Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
	 abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a
	 ser el primero*/
	
	

	public void numero(){
	int[] valores = new int [10];
	int ultimo;
	int veces;
	for(byte i = 0; i < 10;i++){
			
	valores[i] = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un numero : "));		
		}
veces = Integer.valueOf(JOptionPane.showInputDialog("posiciones a desplazar : "));
for(int posi = 1; posi < veces;posi++){
	ultimo = valores[9];	
		
	for(byte i = 8;i >= 0;i--){
		
		valores[i + 1] = valores[i];
		
	}
		valores[0] = ultimo;
}
		for(byte i = 0; i < 10;i++){
			System.out.println("valores [" + i + "] = " + valores[i]);
		}
	}
	
	public void numero2(){
	int[] valores = new int [10];	
		for(byte i = 0; i < 10;i++){
			
			valores[i] = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un numero :"));			
			
		}
int n = Integer.valueOf(JOptionPane.showInputDialog("veces a desplazar :"));		
int[] copia = valores.clone();
		
		for(byte i = 0; i < 10;i++){
	
	valores[i] = copia[(i+n) % 10];
	
}
		
		for(byte i = 0; i < 10;i++){
	System.out.println("Valores [" +i+"] = " + valores[i]);		
		}
	}

// Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
//	al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.	
	
	 
	
	public static void main(String[] args) {
		// TODO Creacion de objetos

		Arrays arra = new Arrays();

		
		
	}

}
