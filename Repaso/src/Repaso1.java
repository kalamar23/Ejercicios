import java.util.*;

import javax.swing.JOptionPane;

import static net.mindview.util.Print.*;

public class Repaso1 {

// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
//	la cantidad de ceros.
	
public void nume (){
	int[] valores = new int[10];
	double pos = 0,neg = 0;
	byte p = 0, n = 0, cero = 0;	
	for(byte i = 0;i < valores.length;i++){	
		valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
	
		if(valores[i] < 0){
			neg += valores[i];
			n++;
		}
		
		else if(valores[i] > 0){
			pos += valores[i];
			p++;
		}
		else if(valores[i] == 0){
			cero++;
		}		
		
	}
	
	print("La media de numeros positivos es : " + pos/p);	
	print("La media de numeros negativos es : " + neg/n);	
	print("La cantidad de ceros : " + cero);
}
	
// Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.

public void matri(){
	int[][] va1 = new int [3][3];
	int[][] va2 = new int [3][3];
int[][] suma = new int [3][3];
	for(byte i = 0; i < va1.length;i++){
		for(byte j = 0; j < va1[i].length;j++){
			va1[i][j] = (int) (Math.random() * 98);
			va2[i][j] = (int) (Math.random() * 98);
			suma[i][j] = va1[i][j] + va2[i][j];
	print("va1[" + i + "][" + j + "] = " + va1[i][j]);
	print("va2[" + i + "][" + j + "] = " + va2[i][j]);
	print("suma[" + i + "][" + j + "] = " + suma[i][j]);
		}

	}
	
}

	public static void main(String[] args) {
		// Creacion de objetos
	
	Repaso1 re = new Repaso1();
	// re.nume();
	re.matri();
	}

}
