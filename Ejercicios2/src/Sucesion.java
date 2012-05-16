import javax.swing.*;
public class Sucesion {

	public void fibo(){
int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite para sucesion :"));
		StringBuffer sb = new StringBuffer();		
// 1,1,2,3,5,8
for(int a = 0,b = 1,c;a < numero;a++){
	
	c = a + b;
	a = b;     
	b = c;     
	
	sb.append(String.valueOf(a) + " , ");
	
}

JOptionPane.showMessageDialog(null, sb);

		
	}
	
	
	
	public static void main(String[] args) {
		// Creacion de objetos
		
		Sucesion su = new Sucesion();
		su.fibo();
		

	}

}
