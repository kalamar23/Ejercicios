import javax.swing.*;

public class Cuadrado {


/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo*/
	
	public void cuadrado(){
		int numero;
	
		try{
		do {
		String s1 = JOptionPane.showInputDialog("Ingrese un numero");
		numero = Integer.valueOf(s1);
		
			if(numero > 0){
			JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es = " + (numero * numero));
			}
			}while(numero > 0);
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Usted debe ingresar un numero");
			cuadrado();
		}
	}
	
	
	
	
	public static void main(String[] args) {

		
		Cuadrado cu = new Cuadrado();
		cu.cuadrado();
		
	}

}
