import javax.swing.*;
public class Tiempo {

	// Escriba un programa que solicite al usuario una cantidad en segundos y la convierta en días, horas, minutos
	// y segundos
	
	public void segundo(){
		
	int second = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de segundos : "));	
	byte count1 = 0;
	byte count2 = 0;
	byte count3 = 0;
	while(second > 86400){
		count1++;
		second -= 86400;
		}
		System.out.println(count1 + "dia");
while(second > 3600){

	count2++;
	second -= 3600;
}
if(count2 != 0)
System.out.println(count2 + " hora");
	
while(second > 60){
	count3++;
	second -= 60;
}

System.out.println(count3 + " minuto");


	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tiempo ti = new Tiempo();
ti.segundo();
	}

}
