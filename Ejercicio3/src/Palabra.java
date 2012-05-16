import javax.swing.*;
public class Palabra {
	

// Escribir dos frases y buscar la ocurrencia de una en la otra 
	
	public void pala1(){
		byte counter = 0;
		String s1 = JOptionPane.showInputDialog("Ingrese una frase : ");
		String s2 = JOptionPane.showInputDialog("Ingrese otra frase : ");
		
while(s2.indexOf(s1) > -1){
	s2 = s2.substring(s2.indexOf(
	        s1)+s1.length(),s2.length());
	      counter++;
	
	
}
		
		
	System.out.println("Frase 1 : " + s1);
	System.out.println("Frase 2 : " + s2);
System.out.println("numero de ocurrencias : " + counter);
	}
	
public static void main(String[] args){
	
	Palabra pa = new Palabra();
	pa.pala1();
	
}
	 
	
 
}
