import java.util.*;
import javax.swing.*;
import java.util.Arrays;
public class Iterador {

public void array(){
	
	int[] arre = {2 ,3 ,4 ,5 , 6}; 

	for(int valo : arre){
		System.out.println("El valor es : " + valo);
		
	}


}

public void array2(){
	
List <Integer> lista = 	Arrays.asList(3, 6, 7, 8, 9, 10);

Iterator <Integer> it = lista.iterator(); 

while(it.hasNext()){
	int valor = it.next();
	if(valor == 7) continue;
	System.out.println("El numero escogido es : " + valor);
}


}

public void array3(){
	
	int[] num = new int[6];
byte j = 0;	
for(byte i = 0; i < num.length;i++){
	
	num[i] = (int) (Math.random() * 98);
}
	

for(int va : num){
		System.out.println("num[" + j + "] = " + va);
		j++;
	}
	
}

// Solicita una frase y despues que ingrese una palabra, el metodo debe indicar cuantas veces aparece la palabra en la frase

public void pala(){
	
	String s1 = JOptionPane.showInputDialog("Ingrese una frase");
	
	System.out.println();
	
}





public static void main(String[] args){

	Iterador it = new Iterador();	
//	it.array();

//	it.array2();
	
//	it.array3();
it.pala();
}



}
