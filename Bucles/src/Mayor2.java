import javax.swing.JOptionPane;


public class Mayor2 {
// muestra el mayor y menor de los valores de un arreglo
	static void mayor(){
		int[] valores = {8 , 23, 7, 12, 4, 19, 34, 6, 89, 5 };
	int menor = 99999, mayor = 0; 
		for(int i = 0; i < valores.length;i++){
	if(valores[i] > mayor){
		mayor = valores[i];
	}
	if(valores[i] < menor){
		menor = valores[i];
	}
			
			
		}
		JOptionPane.showMessageDialog(null, "El numero mayor es : " + mayor + " El numero menor es = " + menor);		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Creacion de objetos
mayor();
	}

}
