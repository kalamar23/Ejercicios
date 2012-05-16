import javax.swing.*;
public class Multiplos {

	// Pedir 5 números e indicar si alguno es múltiplo de 3
	
public void numeros(){
	short conta = 5;
	int numero;
	StringBuffer sb = new StringBuffer();
	while(conta > 0){
		
		String s1 = JOptionPane.showInputDialog("Ingrese un numero :");
		
		numero = Integer.parseInt(s1);
	if(numero % 3 == 0){
		sb.append(String.valueOf(numero) + " , ");
	}
	--conta;
	}
	short largo = (short) sb.length();
	JOptionPane.showMessageDialog(null, "Los siguientes numeros son multiplos de 3 : " + sb.delete(largo -2, largo));
}


	public static void main(String[] args){
		
		Multiplos mu = new Multiplos();
mu.numeros();
		
	}
	
	
	
	
	
	
	
}
