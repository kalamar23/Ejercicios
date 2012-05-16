import javax.swing.JOptionPane;


public class Ordenar {


// solicitar 10 numeros y ordenar de mayor a menor
public void ordenar(){
	int[] numeros = new int [10];
	for(byte i = 0;i < numeros.length;i++){
		
numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un nombre :"));		
	
	}

for(byte i = 1;i < numeros.length;i++){
	
	int length;
	for(byte j = 0;j < (length = numeros.length -i);j++){
		
		if(numeros[j] > numeros[j + 1]){
			
			int temp = numeros[j];
			numeros[j] = numeros[j + 1];
			numeros[j + 1] = temp;
		}
		}	
	
	}


for(byte i = 0;i < numeros.length;i++){
	
	System.out.println("numeros [" + i + "] = " + numeros[i]);
}

}
		




public static void main(String[] args){
	
	Ordenar T = new Ordenar();
	
	T.ordenar();
	
	
}




}
