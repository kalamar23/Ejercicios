import javax.swing.*;
public class Ordenar4 {

//	 Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
//	 de los negativos y contar el número de ceros
public void numeros(){
	int sumaPo = 0, sumaNe = 0;
	byte count1 = 0, count2 = 0, zero = 0;
	int[] nume = new int[5];
	for(byte i = 0; i < nume.length;i++){
		
		nume[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero :"));
	if(nume[i] > 0){
		sumaPo += nume[i];
		count1++;
	}
	if(nume[i] < 0){
		sumaNe += nume[i];
		count2++;
	}
	if(nume[i] == 0){
		zero++;
	}
	
	
	}
JOptionPane.showMessageDialog(null, "El promedio de numeros positivos = " + sumaPo/count1);	
JOptionPane.showMessageDialog(null, "El promedio de numeros negativos = " + sumaNe/count2);	
JOptionPane.showMessageDialog(null, "La cantidad de numeros 0 es = " + zero);	
	
	
	
}
	
	public static void main(String[] args) {
		// Creacion de objetos

		Ordenar4 T = new Ordenar4();
		T.numeros();
	}

}
