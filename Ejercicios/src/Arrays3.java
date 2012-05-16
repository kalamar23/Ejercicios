import javax.swing.JOptionPane;


public class Arrays3 {

//  Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla 	
	public void arreglo(){
		int[][] valores = new int [3][3];
for(byte i = 0;i < valores.length;i++){
	for(byte j = 0;j < valores[i].length;j++){
		
	valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero :"));
		
	}
}
	
for(byte i = 0;i < valores.length;i++){
	for(byte j = 0;j < valores[i].length;j++){
		
System.out.println("valores [" + i + "][" + j + "] = " + valores[i][j]);		

	}		
}
int aux;
//transponer
for(byte i = 1;i < valores.length;i++){
	for(byte j = 0;j < valores[i].length;j++){
		
		aux = valores[i][j];
		valores[i][j] = valores[j][i];
		valores[j][i] = aux;
				
	}

}
	
	for(byte i = 0;i < valores.length;i++){
		for(byte j = 0;j < valores[i].length;j++){
			
			System.out.println("trans[" + i + "][" + j + "] = " + valores[i][j]);
		}
	}
	}
	
//  Pedir 10 números, y mostrar al final si se ha introducido alguno negativo	
	
	public void negativo(){
		
int[] numeros = new int [10];
StringBuffer sb = new StringBuffer();
for(byte i = 0;i < numeros.length;i++){
	
numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
if(numeros[i] < 0){
	sb.append(String.valueOf(numeros[i]) + " , ");
}

System.out.println("numeros [" + i + "] = " + numeros[i]);


}
if(sb.length() != 0){
JOptionPane.showMessageDialog(null, " Los siguientes numeros son negativos : " + sb.delete(sb.length() - 2 , sb.length()));
	}
else{
	JOptionPane.showMessageDialog(null, " No hay numeros negativos ");

}
	}
	
	public static void main(String[] args) {
		// TODO Creacion de objetos
Arrays3 arra = new Arrays3();

arra.negativo();
	}

}
