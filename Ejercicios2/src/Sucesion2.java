import javax.swing.*;
public class Sucesion2 {

// Pedir 3 numeros y ordenar de mayor a menor
	public void numeros(){
		int[] nume = new int [10];
	for(byte i = 0;i <  nume.length;i++){
		
		nume[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
		
	}		
byte i = 0;
byte m = 0;
int temp;
while(m < 10){
while(i < (9 - m)){
	
	if(nume[i] < nume[i + 1]){
	temp = nume[i];	
	nume[i] = nume[i + 1];
	nume[i + 1] = temp;		
	}
	
i++;	
}
i = 0;
m++;
}
		
for(byte k = 0;k <  nume.length;k++){
System.out.println("nume[" + k + "] = " + nume[k]);
}
	}

	//  Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que
	// se encuentra. Si no está, indicarlo con un mensaje
	
public void enteros(){
	
	int[] nume = new int [10];
	for(byte i = 0;i < nume.length;i++){
		
		nume[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
				
	}

	for(byte i = 1;i < nume.length;i++){
		
		for(byte k = 0;k < nume.length - i;k++){
			if(nume[k] > nume[k + 1]){
				int temp = nume[k];
				nume[k] = nume[k + 1];
				nume[k + 1] = temp;
			}
			
		}
		
	}
boolean found = false;
byte index = 0;
int target = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero a buscar : "));	
	for(byte i = 0; i < nume.length;i++){
		
		if(nume[i] == target){
		found = true;
		index = i;
		}
	}
	JOptionPane.showMessageDialog(null,(found) ? "El numero " + target + " Se encuentra en la ubicación " + index : "El numero " + target + " No se encuentra en el sistema");
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sucesion2 su = new Sucesion2();
	su.enteros();
		
	}

}
