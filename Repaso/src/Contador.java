import javax.swing.*;
import static net.mindview.util.Print.*;

public class Contador {

// Solicita una frase y después una palabra , la función 	
	public void conta(){
		byte count = 0;
		String texto = JOptionPane.showInputDialog("Escriba una frase : "); 
		String palabra = JOptionPane.showInputDialog("Palabra a buscar :"); 
	
		while(texto.indexOf(palabra) > -1){
			
			texto = texto.substring(texto.indexOf(palabra) + palabra.length(),texto.length());
			
			count++;
		}
		

		JOptionPane.showMessageDialog(null, "La palabra " + palabra + " aparece : " + count + " veces");

	}
	
	
	public static void main(String[] args){
		
	Contador co = new Contador();
	
	co.conta();
		
		
		
	}
	
	
	
	
}
