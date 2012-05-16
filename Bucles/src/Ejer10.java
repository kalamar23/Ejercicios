/**
 */
import javax.swing.*;
import java.util.*;
public class Ejer10 {

// mostrar el numero primo menor de un numero	
public void Primo(){
int numero, conta = 2, temp, ID = 0 ;
boolean primo = true;
String s1 =	JOptionPane.showInputDialog("Ingrese un numero :");
	numero = Integer.parseInt(s1);	
for(int i = (numero - 1);i > 0; i--){
	while((primo) && conta < i){
		if(i % conta == 0)
			primo = false;	
		conta++;
	}
	if(primo){
		ID = i;
		JOptionPane.showMessageDialog(null, "El numero primo menor que " + numero + " es = " + ID);			
	break;
	}	
primo = true;
}	

}

// convertir de decimal a hexadecimal
static void conver(){
int numero;
String s1 = JOptionPane.showInputDialog("Ingrese un numero");
	numero = Integer.parseInt(s1);
	
	int select = JOptionPane.showOptionDialog(
			   null,
			   "Convertir el numero a : ", 
			   "Selector de opciones",
			   JOptionPane.YES_NO_CANCEL_OPTION,
			   JOptionPane.QUESTION_MESSAGE,
			   null,    // null para icono por defecto.
			   new Object[] { "Hexadecimal", "Binario", "Cerrar" },   // null para YES, NO y CANCEL
			   "Cerrar");	
	
	
	switch(select){
	case 0 : Hexa(numero);break;
	case 1 : Bina(numero);break;
	case 2 : Cerrar();break; 
	}
}

static void Hexa(int numero){
	int temp = numero, op;
	StringBuffer sb = new StringBuffer();
	Stack st = new Stack();

	while(temp > 0){
		op = temp % 16;
	if(op <= 15 && op > 9){
		
		switch(op){	
		case 15 : st.push(String.valueOf("F")); break;
		case 14 : st.push(String.valueOf("E")); break;
		case 13 : st.push(String.valueOf("D")); break;
		case 12 : st.push(String.valueOf("C")); break;
		case 11 : st.push(String.valueOf("B")); break;
		case 10 : st.push(String.valueOf("A")); break;

		}
	}
	
		else{
			st.push(String.valueOf(temp % 16));
		}	
	temp >>>= 4;	

	}
	
	while(!(st.isEmpty())){
		
		sb.append(new String ((String) st.pop()));
	
	}
	
	JOptionPane.showMessageDialog(null, "El numero " + numero + " convertido a hexadecimal es :" + sb );
}

static void Bina(int numero){
	int temp = numero;
StringBuffer sb = new StringBuffer();
Stack st = new Stack();
	while(temp > 0){
		
		st.push(String.valueOf(temp % 2));
		temp >>>= 1;
	}
	
	while(!st.empty()){
		sb.append(new String ((String) st.pop())); 
	}
	
JOptionPane.showMessageDialog(null, numero + " convertido a binario es : " +sb);	
}
static void Cerrar(){
	JOptionPane.showMessageDialog(null, "Fin de programa !");
}
	


public static void main(String[] args) {
		// TODO Creacion de objetos
conver();
	}

}
